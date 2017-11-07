import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import clicklinks.CLICKLINKS;
import cookietest.COOK;
import myPack01.TC01;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	@Ignore CLICKLINKS.class,
	COOK.class,
	TC01.class
})
public class RUNSUITE {

}
