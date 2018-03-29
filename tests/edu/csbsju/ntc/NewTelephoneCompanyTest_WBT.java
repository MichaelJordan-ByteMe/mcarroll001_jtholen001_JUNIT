/**
 * 
 */
package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mcarroll001
 *
 */
public class NewTelephoneCompanyTest_WBT {
	NewTelephoneCompany ntc;
	
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidStartTime9() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidDuration1() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test (expected = UnsupportedOperationException.class)
	public void testInvalidDuration2() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTimeAndDiscountedDuration1() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		Assert.assertTrue("Should return 1768.0", ntc.computeCharge() == 1768.0);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTimeAndDiscountedDuration2() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		Assert.assertTrue("Should return 1078.48", ntc.computeCharge() == 1078.48);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTimeAndDiscountedDuration3() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		Assert.assertTrue("Should return 1078.48", ntc.computeCharge() == 1078.48);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTimeAndDiscountedDuration4() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		Assert.assertTrue("Should return 1149.2", ntc.computeCharge() == 1149.2);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTime1() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		Assert.assertTrue("Should return 1248.0", ntc.computeCharge() == 1248.0);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTime2() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		Assert.assertTrue("Should return 1227.2", ntc.computeCharge() == 1227.2);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTime3() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		Assert.assertTrue("Should return 20.8", ntc.computeCharge() == 20.8);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTime4() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		Assert.assertTrue("Should return 208.0", ntc.computeCharge() == 208.0);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTime5() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		Assert.assertTrue("Should return 208.0", ntc.computeCharge() == 208.0);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedStartTime6() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		Assert.assertTrue("Should return 208.0", ntc.computeCharge() == 208.0);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedDuration1() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		Assert.assertTrue("Should return 2298.4", ntc.computeCharge() == 2298.4);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testDiscountedDuration2() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		Assert.assertTrue("Should return 2156.96", ntc.computeCharge() == 2156.96);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testNoDiscounts1() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		Assert.assertTrue("Should return 1664.0", ntc.computeCharge() == 1664.0);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testNoDiscounts2() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		Assert.assertTrue("Should return 41.6", ntc.computeCharge() == 41.6);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testNoDiscounts3() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		Assert.assertTrue("Should return 2454.4", ntc.computeCharge() == 2454.4);
	}
	
	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#getStartTime()}.
	 */
	@Test
	public void testNoDiscounts4() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		Assert.assertTrue("Should return 2496.0", ntc.computeCharge() == 2496.0);
	}
}
