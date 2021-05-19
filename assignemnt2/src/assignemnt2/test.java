package assignemnt2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		Q_Web d= new Q_Web(5.0,15);

		assertEquals(75,d.getPrice());
	}

}
