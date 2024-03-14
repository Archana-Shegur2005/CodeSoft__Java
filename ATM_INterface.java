import java.util.*;
class user
{
	Scanner sc=new Scanner(System.in);
	int amount=5000;

    void withdraw()
        {
            System.out.println("\n\n                       -------------------                            ");
            System.out.println("*********************   Withdraw Section  *********************");
            System.out.println("                       -------------------                            \n\n");
            System.out.print("    Enter Amount You want to Withdraw !! : ");
            int wid=sc.nextInt();
            if(amount>wid)
            {
                 amount-=wid;
                System.out.println("\n    your "+wid+" Amount Withdrwa Successfully !!!\n");
            }
            else
            {
                System.out.println("    No more amount in your bank balance To Withdraw !!!");
            }
           
            System.out.println("    For more information Check your balance again!!\n");
            System.out.println("**************************************************************\n\n");
        
        }
	void deposite()
        {
            System.out.println("\n\n                       -------------------                            ");
            System.out.println("*********************   Deposite Section  *********************");
            System.out.println("                       -------------------                            \n\n");
            System.out.print("    Enter Amount You want to Deposite !! : ");
            int dep=sc.nextInt();

            amount+=dep;
            System.out.println("\n    your "+dep+" Amount Deposite Successfully !!!\n");
            System.out.println("    For more information Check your balance again!!\n");
               System.out.println("**************************************************************\n\n");
        }

        

        void checkBalance()
        {
            System.out.println("\n\n                       -------------------                            ");
            System.out.println("*********************   Balance Section  *********************");
            System.out.println("                       -------------------                            ");
            System.out.println("\n           Total Bank Balance in your bank account is :"+amount);
            System.out.println("\n**************************************************************\n\n");
        }
		
}	
class ATM_INterface
{
	public static void main(String args[])
	{
	   user obj=new user();	
	   Scanner sc=new Scanner(System.in);
	    int ch;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----------------------    WELCOME TO ATM  -----------------------------");
        System.out.println("-----------------------------------------------------------------------\n\n");
       do 
        {
            System.out.println("\n                            Menu                                        ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("  Press 1 for Deposite Amount ");
            System.out.println("  Press 2 for Withdraw Amount ");
            System.out.println("  Press 3 for Check Balance ");
            System.out.println("  Press 4 for Exit ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("  Enter Your choice here : ");
            ch=sc.nextInt();
            
			switch(ch)
			{
				case 1:obj.deposite();
						break;
				case 2:obj.withdraw();
						break;
				case 3:obj.checkBalance();
						break;
				case 4:System.out.println("\n   *****************       Thank you for Visiting !!      *****************\n");
						break;
				default:System.out.println("invalid choice");
			}
        }while(ch!=4);
	}	
}

