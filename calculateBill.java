class calculateBill  {
public static final int steadyTax = 102;
public float flowTax = 112.0f;
protected double calculateBil(double con)

	{
		if(con<100)
		{
			return con * 3.44 + steadyTax +flowTax;
		}
		else if (con <= 300)  
		{
			return 100 * 3.44 + (con - 100) * 7.34 + steadyTax+flowTax;
		}
		else if (con > 300 && con <= 500)
		{
			return 100 * 3.44 + 200 * 7.34 + (con - 300) * 10.36 + steadyTax+flowTax;
		}
		else if (con > 501 && con <= 1000)
		{
			return 100 * 3.44 + 200 * 7.34 + 300 * 10.36 + (con - 501) * 11.82 + steadyTax+flowTax;
		}  
		else
        {
            return 100 * 3.44 + 200 * 7.34 + 300 * 10.36 + (con - 501) * 11.82 + steadyTax+flowTax;
        } 
	}
}