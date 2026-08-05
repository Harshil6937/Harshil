import java.util.Scanner;
public class Project_main
{		
		static Scanner obj=new Scanner(System.in);
		static String [] username = new String [100];
		static String [] password = new String [100];
		static String [] email = new String [100];
		static String [] adhar = new String [100];
		static String [] pan = new String [100];
		static String [] mobileno = new String [100];
		static String [] gender = new String[100];
		static String [] address = new String[100];
		static int [] age = new int [100];
		static int count=0;
		static double [] balance = new double [100];

	public static void main(String [] s) {
		
		
		System.out.println("--------------------------");
		System.out.println("--BANK MANAGEMENT SYSTEM--");
		System.out.println("--------------------------");

		int choice;
		

		do{
			System.out.print("\n1.Register\n2.Login\n3.Exit");
			System.out.print("\nEnter Your Choice\n");
			choice=obj.nextInt();
			obj.nextLine();

			switch(choice)
			{
			case 1:

				registeruser();				

				break;

			case 2:

				login();

				break;

			case 3:

				exit();
				break;

			default :

                System.out.println("Invalid Choice!");

           	}
		}while(true);
	}


	public static void registeruser()
	{	
				if(count == 100)
			    {
			        System.out.println("Maximum Number Of Users Reached!");
			        return;
			    }

				System.out.print("Enter Name:");
		String	name=obj.nextLine();

				for(int i = 0; i < count; i++)
				{
				    if(username[i].equals(name))
				    {
				        System.out.println("Username Already Exists!");
				        return;
				    }
				}

				System.out.print("Enter Password:");
		String	pass=obj.nextLine();
				
				System.out.print("Enter Your Gender(M/F):");
	    String	gen=obj.nextLine();
				
				System.out.print("Enter Your Age:");
		int		ages=obj.nextInt();
				obj.nextLine();
				
				if(ages <= 0)
				{
				    System.out.println("Invalid Age!");
				    return;
				}
	
				System.out.print("Enter Email:");
		String	emails=obj.nextLine();
				
				System.out.print("Enter Mobile No:");
		String	mn=obj.nextLine();
				
				System.out.print("Enter Adhar Number:");
		String	adharno=obj.nextLine();
				
				System.out.print("Enter PAN Number:");
		String	panno=obj.nextLine();
				
				System.out.print("Enter Address:");
		String	addres=obj.nextLine();
				
				System.out.print("Enter Opening Balance (Minimum Rs.10000): ");
		Double	balances=obj.nextDouble();
				obj.nextLine();

				if(balances<10000)
				{
				    System.out.println("Account cannot be created. Minimum opening balance is Rs.10000.");
					return;
				}

				username[count]=name;
				password[count]=pass;
				gender[count]=gen;
				age[count]=ages;
				email[count]=emails;
				mobileno[count]=mn;
				adhar[count]=adharno;
				pan[count]=panno;
				address[count]=addres;
				balance[count]=balances;

				count++;		
				System.out.println("\nRegistration Successful!");
	}

	public static void login()
	{
				System.out.println("Enter Username:");
				String loginusername=obj.nextLine();
				System.out.println("Enter Password:");
				String loginpassword=obj.nextLine();
				
			
				for(var i=0;i<count;i++)
				{
					if(username[i].equals(loginusername) && password[i].equals(loginpassword))
					{
						System.out.println("\nLogin Successful!\n");
						return ;
					}
				}

				System.out.println("Invalid Username or Password!");
	}

	public static void exit()
	{
		System.out.println("Exiting...");
		System.exit(0);
	}

}
