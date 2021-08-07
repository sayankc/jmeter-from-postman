# Overview
base framework is taken from [Lodium](https://github.com/Loadium/postman2jmx)


This code will convert any postman collection to jmx file. The JMX file can be used to run directly in Jmeter.

## Features
- Compatable with Jmeter 5.4.1
- Auto-parameterization of thread group
- Alert for exisitng parameters.
- Default response Assertion for each request
- Default delay of 100ms for each API
- Best suited for quick conversion of performance script for microservices.

## To Build:

```
mvn clean install
```

## To Use:

```
cd target
```
- Then execute the following command to convert your postman/newman json collection file to the jmeter file (jmx).
```sh
$ java -jar newman2jmeter.jar my_postman_collection.json my_jemter_file.jmx
```
*Note: `target/jmeter` folder contains all jmeter related properties. `target/lib` folder contains all dependencies.
Both of these should be present in the same folder,where the jar is present.*

**OR**
```sh
$ java -jar newman2jmeter-0.2.5-jar-with-dependencies.jar my_postman_collection.json my_jemter_file.jmx
```
*Note: `target/jmeter` folder contains all jmeter related properties. It should be present in the same folder,where the jar is present.*

## To Run:

Generated script has parameters defiend for it's thread group (users, duration). So, it can be executed in non-GUI mode directlyafter providing parameter values, if any . Here is the sample.

```
jmeter -n -t my_jemter_file.jmx -l my_jemter_result.csv -Jusers=10 -Jduration=300
```
