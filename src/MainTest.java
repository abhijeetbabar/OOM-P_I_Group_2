import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testMain() {
		JulianNumber date = new JulianNumber(2018, 5, 16);
		System.out.println("checking JulianNumber test with 2018, 5, 16 as inputs");
		System.out.println(date.toDate());
		System.out.println();
		System.out.println();
		System.out.println("checking JulianNumber test with 2638011(2018.05.16) as inputs");
		System.out.println(new JulianNumber(2018, 5, 16));
		
		fail("Not yet implemented");
	}

}
