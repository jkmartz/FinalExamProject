package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetirementTest {

	@Test
	public void testAmountToSave() {
		//public Retirement(double dAnnualReturnWorking, int iYearsRetired,
		//double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySSI)
		//public static double pmt(double r, double n, double p, double f, boolean t)
		double rWork = 0.02/12;
		double rRetired = 0.07/12;
		int n = 20*12;
		double p = 10000;
		double f = 0;
		double SSI = 2642;
		Retirement rtm = new Retirement(rWork,n,rRetired, f, SSI);
		double dMonthly = rtm.AmountToSave();
		System.out.print(dMonthly);
		if (dMonthly != 1454485.55)	{
			fail("Monthly Payment Incorrect");
		}
	}
	
	@Test
	public void testTotalAmountSaved()	{
		//public static double pv(double r, double n, double y, double f, boolean t)
		double rWork = 0.02/12;
		double rRetired = 0.07/12;
		int n = 20*12;
		double p = 10000;
		double f = 0;
		double SSI = 2642;
		Retirement rtm = new Retirement(rWork,n,rRetired, f, SSI);
		double dMonthly = rtm.AmountToSave();
		System.out.print(dMonthly);
		if (dMonthly != 1454485.55)	{
			fail("Monthly Payment Incorrect");
		}
	}
}
