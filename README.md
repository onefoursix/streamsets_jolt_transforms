## streamsets_jolt_transforms

This project provides an example StreamSets pipeline with a Groovy Processor as a wrapper for [Jolt Transforms](https://github.com/bazaarvoice/jolt)

This project's example JSON input and output files, as well as the Jolt spec file, have been taken directly from the Jolt project's [Getting Started](https://github.com/bazaarvoice/jolt/blob/master/gettingStarted.md) file.

### Prerequisites

- Maven is needed to build the Jolt jar file

- The Groovy 4.0 StreamSets stage lib

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

Import the example [pipeline](/pipelines).  The pipeline looks like this:


&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/pipeline.png" alt="pipeline.png" width="500"/>

### Import the two Jolt jar files into the Groovy Stage:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/external-libs.png" alt="external-libs.png" width="500"/>


### Set pipeline parameters

Set the pipeline parameters including the JSON input and output directories and the Jolt spec file:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/params.png" alt="params.png" width="500"/>
