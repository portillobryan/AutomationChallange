package com.co.api;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static com.co.util.ReportsUtil.generateCucumberReport;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRunner {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:com/co/api")
                .outputCucumberJson(true)
                .parallel(1);
        generateCucumberReport(results.getReportDir());
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
