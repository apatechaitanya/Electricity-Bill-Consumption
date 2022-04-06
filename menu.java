import java.util.*;
import POJO.datamembers;

class menu {
    public static int choice = 0;	
    Scanner sc = new Scanner(System.in);
	static int customerNumber;
	static String customerName;
	static double con;
    void mainMenu() {
        
        data();
        do {
            
            try {

                choice = sc.nextInt();
            } catch (Throwable e) {
				System.out.println();
                System.out.println( "You Entered Invalid Input...");
                
                System.exit(0);
            }
            
                switch (choice) {
                    case 1:
                        try {  
							input();
                            datamembers datamembers = new datamembers(customerNumber,customerName,con);

                            electriCityBill e = new electriCityBill();
                            e.showData();
                            //sc.close();

                        } catch (Throwable e) {
                            System.out.println("");

                            System.out.println("You Entered Invalid Input...");
                            
                            System.exit(0);
                        }
                        break;
                    case 2:
			try {  
			    input();
                            datamembers datamembers = new datamembers(customerNumber,customerName,con);

                            IndustryBill b = new IndustryBill();
                            b.showData();
                            //sc.close();

                        } catch (Throwable b) {
                            System.out.println("");

                            System.out.println("You Entered Invalid Input...");
                            
                            System.exit(0);
                        }
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            
                data();
        } while (choice != 3 );

    }
	
	
void data()
{
            System.out.println("|---------------------------------------|");
            System.out.println("|              WELCOME                  |");
            System.out.println("|---------------------------------------|");
            System.out.println(" WHICH TYPE OF ELECTRICITY DO YOU WANT TO CALCULATE ");
            System.out.println(" 1 . HOME ELECTRICITY BILL  ");
            System.out.println(" 2 . INDUSTRY ELECTRICITY BILL ");
            System.out.println(" 3 . TO EXIT ");
            System.out.println(" ENTER CHOICE AS PER YOUR NEED :");
                
}
void input()
{
			System.out.print("Enter the Customer Number : ");
             customerNumber = sc.nextInt();
			System.out.print("Enter the Customer Name   : ");
            sc.nextLine();
            customerName = sc.nextLine();
            System.out.print("Enter the Unit Consume    : ");
            con = sc.nextDouble();
}	

 
}

