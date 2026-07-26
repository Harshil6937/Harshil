import java.util.Scanner;
public class Project_main
{
	public static void main(String [] s) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("--BANK MANAGEMENT SYSTEM--");
		System.out.println("--------------------------");

		int choice;
		String [] username = new String [10];
		String [] password = new String [10];
		String [] email = new String [10];
		int count=0;
		do{
			System.out.print("\n1.Register\n2.Login\n3.Exit");
			System.out.print("\nEnter Your Choice\n");
			choice=obj.nextInt();
			obj.nextLine();

			switch(choice)
			{
			case 1:

				if(count==10)
				{
					System.out.println("Maximum Number Of User Reached:");
					break;
				}
				System.out.println("Enter Name:");
				username[count]=obj.nextLine();
				System.out.println("Enter Password:");
				password[count]=obj.nextLine();
				System.out.println("Enter Email:");
				email[count]=obj.nextLine();
				count++;		
				System.out.println("\nRegistration Successful!");

				break;

			case 2:

				System.out.println("Enter Username:");
				String loginusername=obj.nextLine();
				System.out.println("Enter Password:");
				String loginpassword=obj.nextLine();
				
			
				for(var i=0;i<count;i++)
				{
					if(username[i].equals(loginusername))
					{
						if(password[i].equals(loginpassword))
						{
							System.out.println("\nLogin Successful!\n");
						}
						else{
							System.out.println("\nInvalid Username or Password!\n");
						}
					}
				}

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

	}

	public static void exit()
	{
		System.out.println("Exiting...");
		System.exit(0);
	}


}