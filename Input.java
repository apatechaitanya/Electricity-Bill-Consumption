import java.util.*;
public class Input
{
	Scanner sc = new Scanner(System.in);
	public int customerNumber;
	public String customerName;
	public double con;
void data()
{
            System.out.println("|---------------------------------------|");
            System.out.println("|              WELCOME                  |");
            System.out.println("|---------------------------------------|");
            System.out.println(" WHICH TYPE ELECTRICITY DO YOU WANT TO CALCULATE ");
            System.out.println(" 1 . HOME ELECTRICITY BILL  ");
            System.out.println(" 2 . INDUSTRY ELECTRICITY BILL ");
            System.out.println(" 3 . TO EXIT ");
            System.out.println(" ENTER CHOICE AS PER YOUR NEED :");
                
}
void input()
{
			System.out.print("Enter the Customer Number : ");
            int customerNumber = sc.nextInt();
			System.out.print("Enter the Customer Name   : ");
            sc.nextLine();
            String customerName = sc.nextLine();
            System.out.print("Enter the Unit Consume    : ");
            double con = sc.nextDouble();
}
	
}
