import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

for (record in sdc.records) {
    try {

      // Apply the Jolt Transform
      Object transformedOutput = sdc.state['chainr'].transform(record.value);

      // Replace the record value with the transformed output
      record.value = transformedOutput
      
      // Write the record
      sdc.output.write(record)
      
    } catch (e) {
        sdc.log.error(e.toString(), e)
        sdc.error.write(record, e.toString())
    } 
}

