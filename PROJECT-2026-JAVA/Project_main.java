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
			static int currentUser = -1;

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
			String	name=obj.nextLine().trim();

					for(int i = 0; i < count; i++)
					{
					    if(username[i].equals(name))
					    {
					        System.out.println("Username Already Exists!");
					        return;
					    }
					}

					String pass;

					while(true)
					{

					System.out.print("Enter Password:");
					pass=obj.nextLine().trim();

					if (validatePass(pass))
					{
						System.out.println("Valid Password");
						break;
					}

					else
					{
						System.out.println("Invalid Password!");
    					System.out.print("Password must contain:");
    					System.out.print("- Minimum 8 characters");
    					System.out.print("- Uppercase and lowercase letters");
   						System.out.print("- At least one digit");
    					System.out.println("- At least one special character");
					}
					
					}

					System.out.print("Enter Your Gender(M/F):");
		    String	gen=obj.nextLine().trim();
					
					System.out.print("Enter Your Age:");
			int		ages=obj.nextInt();
					obj.nextLine();
					
					if(ages <= 0)
					{
					    System.out.println("Invalid Age!");
					    return;
					}
		
					String emails;

					while(true)
					{
					
					System.out.print("Enter Email:");
					emails=obj.nextLine().trim();

					if(validateEmail(emails))
					{
						System.out.println("Valid Email-address..");
						break;
					}

					else{
						 System.out.println("Invalid Email!");
					}

					}

					
					System.out.print("Enter Mobile No:");
			String	mn=obj.nextLine().trim();
					
					System.out.print("Enter Adhar Number:");
			String	adharno=obj.nextLine().trim();
					
					System.out.print("Enter PAN Number:");
			String	panno=obj.nextLine().trim();
				
					System.out.print("Enter Address:");
			String	addres=obj.nextLine().trim();
					
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
					String loginusername=obj.nextLine().trim();
					System.out.println("Enter Password:");
					String loginpassword=obj.nextLine().trim();
					
				
					for(int i=0;i<count;i++)
					{
						if(username[i].equals(loginusername) && password[i].equals(loginpassword))
						{
							currentUser=i;
							System.out.println("\nLogin Successful!\n");
							usermenu();
							return;
						}
					}

					System.out.println("Invalid Username or Password!");
		}

		public static void exit()
		{
			System.out.println("Exiting...");
			System.exit(0);
		}

		public static void usermenu()
		{
			
			while(true)
			{
				System.out.println("|||---USER-MENU---|||");
				System.out.println("4.Deposit Money");
				System.out.println("5.Withdraw Money");
				System.out.println("6.Show Balance");
				System.out.println("7.View Account Details");
				System.out.println("8.Log Out");
				System.out.println("\nEnter Choice");
				int choice = obj.nextInt();
				obj.nextLine();

				switch(choice)
				{
					case 4:
						deposit();
						break;

					case 5:
						withdraw();
						break;

					case 6:
						showBalance();
						break;

					case 7:
						viewAccountDetails();
						break;

					case 8:
						logout();
						return;

					default:
						System.out.println("Invalid Choice!");	
						break;
				}
			}
		}

		public static void deposit()
		{
			double amount;

			System.out.println("Enter Deposit Amount:");
			amount=obj.nextDouble();

			if(amount<=0)
			{
				System.out.println("Invalid Amount!");
				return;
			}

			balance[currentUser]+=amount;

			System.out.println("Deposit Successful!");
		} 

		public static void withdraw()
		{
			double amount;

			System.out.println("Enter Withdraw Amount!");
			amount=obj.nextDouble();

			if(amount<=0)
			{
				System.out.println("Invalid Amount!"+"\n");
				return;
			}

			if(amount > balance[currentUser])
			{
				System.out.println("Insufficient Balance!"+"\n");
				return;
			}

			balance[currentUser]-=amount;

			System.out.println("Withdraw Successful!"+"\n");
		}

		public static void showBalance()
		{
			 System.out.println("Balance: Rs." + balance[currentUser]+"\n");
		}

		public static void viewAccountDetails()
		{
			System.out.println("\n===== ACCOUNT DETAILS =====");

			System.out.println("Name            : " + username[currentUser]);
    		System.out.println("Password        : " + password[currentUser]);
    		System.out.println("Gender          : " + gender[currentUser]);
    		System.out.println("Age             : " + age[currentUser]);
    		System.out.println("Email           : " + email[currentUser]);
    		System.out.println("Mobile No       : " + mobileno[currentUser]);
    		System.out.println("Aadhar Number   : " + adhar[currentUser]);
    		System.out.println("PAN Number      : " + pan[currentUser]);
    		System.out.println("Address         : " + address[currentUser]);
    		System.out.println("Balance         : " + balance[currentUser]+"\n");
		}

		public static void logout()
		{
			currentUser=-1;
			System.out.println("Logout Successfully!"+"\n");
		}

		public static boolean validatePass(String pass)
		{
			if(pass.length() < 8)
			{
				return false;
			}

			boolean upper = false;
			boolean lower = false;
			boolean num = false;
			boolean special = false;

			for(int i=0; i<pass.length() ; i++)
			{
				char ch = pass.charAt(i);

				if(Character.isUpperCase(ch))
				{
					upper = true;
				}

				else if(Character.isLowerCase(ch))
				{
					lower = true;
				}

				else if(Character.isDigit(ch))
				{
					num = true;
				}

				else{
					special = true;
				}
			}

			return upper && lower && num && special;		
	}

	public static boolean validateEmail(String mail)
	{
		boolean at = false;

		for(int i=0; i<mail.length(); i++)
		{
			char ch = mail.charAt(i);

			if(ch=='@')
			{
				at = true;
				break;
			}
		}

		return at;
	}
}
