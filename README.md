# owner-java-demo
A demonstration of how to use OWNER with TestNG in a Java project

## License

This project is licensed under the Apache Software License 2.0.

## Usage
To execute this project, use Maven to execute it like so:

```
mvn test -Denv=dev
```

Or:

```
mvn test -Denv=test
```

You should see output similar to:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.github.jrh3k5.owner.OwnerTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@3c0f93f1
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.803 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```