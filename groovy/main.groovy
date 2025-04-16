import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

for (record in sdc.records) {
    try {

      // Load the JSON input file
      file = record.value['fileInfo']['file'] 
      fileContents = new File(file).getText('UTF-8')
      Object inputJSON = JsonUtils.jsonToObject(fileContents, 'UTF-8');

      // Apply the Jolt Transform
      Object transformedOutput = sdc.state['chainr'].transform( inputJSON );

      // Replace the record value with the transformed output
      record.value = transformedOutput
      
      // Write the record
      sdc.output.write(record)
      
    } catch (e) {
        sdc.log.error(e.toString(), e)
        sdc.error.write(record, e.toString())
    } 
}

