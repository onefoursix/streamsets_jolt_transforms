## streamsets_jolt_transforms

This project provides an example StreamSets pipeline with a Groovy Processor that implements [Jolt Transforms](https://github.com/bazaarvoice/jolt).

The project's example JSON input, output, and spec files have been taken directly from the Jolt project's [Getting Started](https://github.com/bazaarvoice/jolt/blob/master/gettingStarted.md) file.

Thanks to Jean-Marie.Bertoncelli@ibm.com for recommending the use of Groovy's JsonSlurper rather than needing to import the Jolt json-utils.

### Prerequisites

- The Groovy 4.0 StreamSets stage lib

### Download the Jolt jar file

- Download <code>jolt-core-0.1.8.jar</code> from [here](https://repo1.maven.org/maven2/com/bazaarvoice/jolt/jolt-core/0.1.8/jolt-core-0.1.8.jar)


### Import the example pipeline

Import the example [pipeline](/pipelines).  The pipeline looks like this:


&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/pipeline.png" alt="pipeline.png" width="500"/>

### Import the Jolt jar file into the Groovy Stage:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/external-libs.png" alt="external-libs.png" width="500"/>

Make sure to restart the engine after adding the jar file.

### Set pipeline parameters

Set the pipeline parameters including the JSON input and output directories and the Jolt spec file:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/params.png" alt="params.png" width="500"/>


### Preview the pipeline

Preview the pipeline and confirm the transform is working:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/preview.png" alt="preview.png" width="700"/>

### Implementation Notes:

The Groovy Processor's init script runs only once, at pipeline startup. This script initializes a Jolt <code>chainr</code> from the Jolt Spec file and saves it in the global cache.

The Groovy Processor's main script uses the cached <code>chainr</code> to apply the transform from the Jolt spec file to each record, overwriting the input JSON with the output JSON.
