// Init the Jolt chainr from the Jolt Spec file and save it in the global cache
import com.bazaarvoice.jolt.Chainr;
import groovy.json.JsonSlurper

joltSpecText = new File(sdc.userParams['JOLT_SPEC']).getText('UTF-8')
chainrSpecJSON = new JsonSlurper().parseText(joltSpecText)
Chainr chainr = Chainr.fromSpec( chainrSpecJSON );
sdc.state['chainr'] = chainr