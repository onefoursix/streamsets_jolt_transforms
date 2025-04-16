// Init the Jolt chainr from the Jolt Spec file and save it in the global cache
import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

joltSpecFile = sdc.userParams['JOLT_SPEC']
List chainrSpecJSON = JsonUtils.filepathToList(joltSpecFile)
Chainr chainr = Chainr.fromSpec( chainrSpecJSON );
sdc.state['chainr'] = chainr