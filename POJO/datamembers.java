package POJO;

public class datamembers {
	private static  int customerNumber;
	private static  String customerName;
	private static double unitConsume;
    
	
	public datamembers(int customerNumber, String customerName, double unitConsume)
    {
		datamembers.customerNumber = customerNumber;
		datamembers.customerName = customerName;
		datamembers.unitConsume = unitConsume;
    }

	public static  int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		datamembers.customerNumber = customerNumber;
	}

	public static  String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		datamembers.customerName = customerName;
	}
	public static  double getUnitConsume() {
		return unitConsume;
	}

	public void setUnitConsume(double unitConsume) {
		datamembers.unitConsume = unitConsume;
	}
}