import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import POJO.datamembers;

class electriCityBill extends calculateBill
{
	
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date date = new Date();
    
    Currency currency = Currency.getInstance("INR");
    String currency_symbol = currency.getSymbol();

    void showData()
    {
		System.out.println();
        System.out.println("|-----------------------------------------------|");
        System.out.println("|            HOUSE ELECTRICITY BILL             |");
		System.out.println("|-----------------------------------------------|");
        System.out.println("    Customer ID             : " + datamembers.getCustomerNumber());
        System.out.println("    Customer Name           : " + datamembers.getCustomerName());
        System.out.println(
                "    Customer Generated Bill : " + calculateBil(datamembers.getUnitConsume()) + " " + currency_symbol);
        System.out.println("    Power Size Used         : " + datamembers.getUnitConsume());
        System.out.println("    Steady Tax              : " + calculateBill.steadyTax);
		
		System.out.println("    Flow Tax                : "+ flowTax);
        System.out.println("    Bill Generated At Date  : " + formatter.format(date));
        System.out.println("|***********************************************|");
		System.out.println();		
	}
}











