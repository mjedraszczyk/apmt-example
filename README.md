## Introduction
This project is an example how to use [APMT](https://github.com/Cognifide/apmt) library.

### References
* [APMT](https://github.com/Cognifide/apmt)

### Getting started
To run custom test you must execute command:
```bash
gradle test --rerun-tasks --tests "com.cognifide.apmt.example.CustomCreatePageTest" -PapmtUserPassword=admin -PauthorUrl=http://localhost:4502 -PpublishUrl=http://localhost:4503
```