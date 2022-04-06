class calculateIndustryBill{
public static final int steadyTax = 500;
protected double calculateIndustryBil(double con){
		if(con<100)
		{
			return con * 7.5 + steadyTax;
		}
		else if (con <= 300)  
		{
			return 100 * 7.5 + (con - 100) * 10.36 + steadyTax;
		}
		else if (con > 300 && con <= 500)
		{
			return 100 * 7.5 + 200 * 10.36 + (con - 300) * 15.5 + steadyTax;
		}
		else if (con > 501 && con <= 10000)
		{
			return 100 * 7.5 + 200 * 10.36 + 300 * 15.5 + (con - 501) * 17.3 + steadyTax;
		}  
		else{
			 return 100 * 7.5 + 200 * 10.36 + 300 * 15.5 + (con - 501) * 17.3 + steadyTax;
		}
	}
}
