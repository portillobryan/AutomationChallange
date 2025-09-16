package com.co.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import java.util.Random;
import java.util.UUID;

public class JsonSchemaUtil {

    public static boolean isValid(String exptSch, String jsonResp) throws Exception {
        if (exptSch.isEmpty() && jsonResp.isEmpty()) {
            return true;
        }
        JsonNode schemaNode = JsonLoader.fromString(exptSch);
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema jsonSchema = factory.getJsonSchema(schemaNode);
        JsonNode jsonNode = JsonLoader.fromString(jsonResp);
        ProcessingReport report = jsonSchema.validate(jsonNode);
        return report.isSuccess();
    }


}
