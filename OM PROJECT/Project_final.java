import java.util.Scanner;

class BankAccount{
	private int AccountNumber;
	private double balance;
	private User owner;

	public int getAccountnum()
	{
		return AccountNumber;
	}

	public void setAccountnum(int Accountnumber)
	{
		this.AccountNumber=AccountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public User getOwner()
	{
		return owner;
	}

	public void setOwner(User owner)
	{
		this.owner=owner;
	}	

}
class User
{
	String username;
	String password;
	String gen;
	String mail;
	String phoneno;
	String adhhar;
	String pannum;
	String acctype;
	double balance;
	int age;

	BankAccount account;
}

public class Project_final
{
	static Scanner obj=new Scanner(System.in);

	static User[]user=new User[100];
	static int accountNumber=820000;

	static int count = 0;
	static int currentUser=-1;

	public static void main(String [] args)
	{
		System.out.println("---BANK MANAGEMENT SYSTEM---");

		int choice;

		while(true)
		{
			System.out.print("\n1.Register\n2.Login\n3.Exit");
			System.out.print("\nEnter Your Choice\n");
			choice=obj.nextInt();

			switch(choice)
			{
			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 3:
				exit();
				break;
			  default:
			  	System.out.println("Invaid Choice");
			}
		}
	}

	public static void register()
	{
		if(count==100)
		{
			System.out.println("Maximum Number Of Users Reached");
			return;
		}
		obj.nextLine();

		System.out.println("enter username:");
	   String name=obj.nextLine();

		for(int i=0;i<count;i++)
		{
			if(user[i].username.equals(name))
			{
				System.out.println("Username already exists");
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

	  	System.out.println("enter Gender");
	   String g=obj.nextLine().trim();

	   System.out.println("enter Age");
	   int ages=obj.nextInt();

	   if(ages <= 0)
	   {
			System.out.println("Invalid Age!");
			return;
	   }

	   obj.nextLine();

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

		System.out.println("Enter Phone Number");
	  String Phone=obj.nextLine().trim();

	 	System.out.println("Enter Aadhar Number");
	  String anum=obj.nextLine().trim();

	  	System.out.println("Enter Pan Number");
	  String pannum=obj.nextLine().trim();

	  	String  typ;

				while(true)
				{
					System.out.println("Enter Account Type(Saving/Current)");
				    typ=obj.nextLine().trim();

					if(typ.equalsIgnoreCase("Saving") || typ.equalsIgnoreCase("Current"))
				    {
				        break;
				    }
				    else
				    {
				        System.out.println("Please Enter Correct Account Type!");
				    }

				}

	  	System.out.println("Enter Opening Balance");
	  double balances=obj.nextDouble();


	   	obj.nextLine();
	 	user[count]=new User();
	 	user[count].account=new BankAccount();
	  	accountNumber++;

	  	user[count].account.setAccountnum(accountNumber);
	  	user[count].account.setBalance(balances);
	  	user[count].account.setOwner(user[count]);



	 	user[count].username=name;
	 	user[count].password=pass;
	 	user[count].gen=g;
	 	user[count].age=ages;
		user[count].mail = emails	;
	 	user[count].phoneno=Phone;
	 	user[count].adhhar=anum;
	 	user[count].pannum=pannum;
	 	user[count].acctype=typ;
	 	user[count].balance=balances;

	 	count++;
	 	System.out.println("\nRegistration Successfull!");
	}

	public static void login()
	{
		obj.nextLine();
		System.out.println("Enter Username:");
	String loginusername=obj.nextLine();
		System.out.println("Enter Password:");
	String loginpass=obj.nextLine();

	for(int i=0;i<count;i++)
	{
		if(user[i].username.equals(loginusername)&&user[i].password.equals(loginpass))
		{
			currentUser=i;
			System.out.println("\nLogin Successfull!\n");
			usermenu();
			return;
		}
	  else{

	  System.out.println("Invalid Username or Password!");
	}
  }
}

	public static void exit()
	{
		System.out.println("Exited Successfully...");
		System.exit(0);
	}

	public static void usermenu()
	{
		while(true)
		{
			System.out.println("|||---USER MENU---|||");
			System.out.println("4.Deposit Money");
			System.out.println("5.Withdraw Money");
			System.out.println("6.Show Balance");
			System.out.println("7.View Account Details");
			System.out.println("8.Log Out");
			System.out.println("\nEnter Choice");

			int choice=obj.nextInt();
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
				System.out.println("Invalid Choice");
				break;

			}
		}
	}

	public static void deposit()
	{
		double amount;

		System.out.println("enter the deposit amount");
		amount=obj.nextDouble();


		if(amount<=0)
		{
			System.out.println("Invalid amount!");
			return;
		}

		user[currentUser].balance+=amount;
		System.out.println("Deposit Successfull"+"\n");
	}

	public static void withdraw()
	{
		double amount;

		System.out.println("Enter withdraw Amount!"+"\n");
		amount = obj.nextDouble();	

		if(amount<=0)
		{
			System.out.println("Invalid amount!");
			return;
		}

		if(amount>user[currentUser].balance)
		{
			System.out.println("Insufficient Balance!"+"\n");
			return;
		}

		user[currentUser].balance-=amount;

		System.out.println("Withdraw Successfull"+"\n");
	}

	public static void showBalance()
	{
		System.out.println("Balance: Rs." + user[currentUser].balance+"\n");
	}

	public static void viewAccountDetails()
	{
		System.out.println("\n====Account Details====");

		System.out.println("Name :"+user[currentUser].username);
		System.out.println("Password :"+user[currentUser].password);
		System.out.println("Gender :"+user[currentUser].gen);
		System.out.println("Age :"+user[currentUser].age);
		System.out.println("Email :"+user[currentUser].mail);
		System.out.println("Phone No :"+user[currentUser].phoneno);
		System.out.println("Aadhar Number :"+user[currentUser].adhhar);
		System.out.println("PAN Number :"+user[currentUser].pannum);
		System.out.println("Account Type :"+user[currentUser].acctype);
		System.out.println("Balance :"+user[currentUser].balance);
	}

	public static void logout()
	{
		currentUser=-1;
		System.out.println("Logout Successfully!"+"\n");
	}

	public static boolean validatePass(String pass)
	{
		if(pass.length()<8)
		{
			return false;
		}

		boolean upper = false;
		boolean lower = false;
		boolean num = false;
		boolean special = false;

		for(int i=0;i<pass.length();i++)
		{
			char ch=pass.charAt(i);

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

		for(int i=0;i<mail.length();i++)
		{
			char ch=mail.charAt(i);

			if(ch=='@')
			{
				at = true;
				break;
			}
		}

		return at;
	}

}