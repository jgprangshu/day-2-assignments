import java.util.*;
class Employee
{
	public static void main(String[] args)
	{
		int id,monthlyBasic;
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your ID:");
		id=sc.nextInt();
		System.out.println("Enter your basic salary:");
		monthlyBasic=sc.nextInt();

		int pf=monthlyBasic/10;
		if(monthlyBasic>6500)
		{
			pf=6500;
		}
		double esic=0;
		if(monthlyBasic<=5000)
		{
			esic=monthlyBasic*0.0475;
		}
		int pTax=100;
		int monthGrossSalary=getMonthlyGrossSalary(monthlyBasic);
		double monthlyDeductions=getMonthlyDeductions(esic,pf,pTax);
		double takeHomeMonthly=getMonthlyTakeHome(monthGrossSalary,monthlyDeductions);
		if(monthGrossSalary<=10000)
		{
			pTax=50;
		}
		System.out.println("Annual salary is"+" "+getAnnualBasic(monthlyBasic));
		System.out.println("Monthly gross salary is"+" "+monthGrossSalary);
		System.out.println("Annual gross salary is"+" "+getAnnualGrossSalary(monthGrossSalary));
		System.out.println("Monthly deductions in salary are"+" "+monthlyDeductions);
		System.out.println("Monthly take home salary is"+" "+takeHomeMonthly);
		System.out.println("Anually take home salary is"+" "+getAnnualTakeHome(takeHomeMonthly));
	}

	public static int getAnnualBasic(int annualBasic)
	{
		return annualBasic*12;
	}

	public static int getMonthlyGrossSalary(int monthlyGross)
	{
		return monthlyGross+(monthlyGross/2)+1250+800;
	}
	public static int getAnnualGrossSalary(int annualGross)
	{
		return annualGross*12;
	}
	public static double getMonthlyDeductions(double e,int p,int t)	
	{
		return e+p+t;
	}
	public static double getMonthlyTakeHome(int mg,double md)
	{
		return mg-md;
	}
	public static double getAnnualTakeHome(double month)
	{
		return month*12;
	}	
}	