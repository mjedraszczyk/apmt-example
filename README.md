## Introduction
This project is an example how to use [APMT](https://github.com/Cognifide/apmt) library.

### References
* [APMT](https://github.com/Cognifide/apmt)

### Prerequisites
Before you run the test, you need to: 
* Prepare AEM 6.5 author instance
* Install We.Retail Community Site package
* Create test users (you can use this [APM script](https://github.com/Cognifide/apmt/apmt-example.apm) to do that)
### Running test
To run test you must execute command:
```bash
gradle test --rerun-tasks --tests "com.cognifide.apmt.example.CustomCreatePageTest" -PapmtUserPassword=admin -PauthorUrl=http://localhost:4502 -PpublishUrl=http://localhost:4503
```