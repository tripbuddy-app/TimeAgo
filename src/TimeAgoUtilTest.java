import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;


public class TimeAgoUtilTest {

	@Before
	public void setUp() throws Exception {
		// Use this tool http://www.fileformat.info/tip/java/date2millis.htm
		// to create sample dates
	}

	@Test
	public void testSeconds() {
		assertEquals(TimeAgoUtils.timeAgo(new Date()), "now");
		assertEquals(TimeAgoUtils.timeAgo(new Date(), true), "just now");
	}
	
	@Test
	public void testYears() {
		long y = 14025807;
		assertEquals(TimeAgoUtils.timeAgo(new Date(y)), "49y");
	}
}
