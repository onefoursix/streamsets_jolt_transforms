## streamsets_jolt_transforms_

This project provides an example StreamSets pipeline with a Groovy Processor as a wrapper for [Jolt Transforms](https://github.com/bazaarvoice/jolt)


### Prerequisites

- Maven is needed to build the Jolt jar file

### Build the Jolt project

- Clone the [Jolt Project](https://github.com/bazaarvoice/jolt) to your local machine

- Switch to the root of the projet and build it:

	<code>$ mvn package -DskipTests</code>
	
- This will generate the two jar files we will import into the Groovy stage:
 ```
		jolt-core/target/jolt-core-0.1.9-SNAPSHOT.jar
		json-utils/target/json-utils-0.1.9-SNAPSHOT.jar
	
```

### Import the example pipeline

Import the example [pipeline](/pipelines)