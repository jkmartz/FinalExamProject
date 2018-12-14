package pkgCore;

import org.apache.poi.ss.formula.functions.FinanceLib;
public class Retirement {

	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//built the constructor
	
	public Retirement(double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySSI)
	{
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}
	
	 //made getters and setters for the attributes above.
	
	private int iYearsToWork;
	public int getiYearsToWork() {
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}

	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}

	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		return FinanceLib.pmt(getdAnnualReturnWorking()/12, 12*getiYearsToWork(), TotalAmountSaved() - getdMonthlySSI(),0, false);
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		return FinanceLib.pv(getdAnnualReturnWorking(), getiYearsToWork(), getdRequiredIncome(), 0, false);
	}
	
	//public static double pv(double r, double n, double y, double f, boolean t) 
    /**
     * Present value of an amount given the number of future payments, rate, amount
     * of individual payment, future value and boolean value indicating whether
     * payments are due at the beginning of period
     * (false => payments are due at end of period)
     * @param r
     * @param n
     * @param y
     * @param f
     * @param t
     */
	
	//public static double pmt(double r, double n, double p, double f, boolean t) 
	
}
