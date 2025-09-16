function fn() {
var env = karate.env; // get system property 'karate.env'
karate.log('karate.env system property was:', env);
var content_type = 'application/json'
var urlenvApi = karate.properties['url.apiRest'];
var urlApi = ''

  if (!env) {
    env = 'dev';
  }
  if (env == 'dev') {

    urlApi = urlenvApi;
    // customize
    // e.g. config.foo = 'bar';
  } else if (env == 'e2e') {
    // customize
  }
  var config = {
      env: env,
      urlApi: urlApi,
      content_type:content_type
  }
  return config;
}