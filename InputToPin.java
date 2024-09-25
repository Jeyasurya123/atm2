package AATask;

import java.util.Scanner;
abstract class Detail
{
    private int UserInputPin;

    public void setUserPin(int UserInputPin) {
        if(UserInputPin>999 && UserInputPin<10000)
        {
            this.UserInputPin = UserInputPin;
        }
        else{
            System.out.println("Your pin must in 4digit");
        }
    }
    
    public int getUserPin() {
        return UserInputPin;
    }
    abstract void show();
}

public class InputToPin extends Detail {

    public void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you Name =");
        String Username=sc.nextLine();
        System.out.print("Enter your Accountno =");
        int UserAccountNo=sc.nextInt();
        System.out.println("Username = "+Username +":"+"UserAccountno ="+UserAccountNo);
        int balance;
        System.out.print("Set your Balance :");
        balance=sc.nextInt();
        System.out.print("Set the ATM pin =");
        setUserPin(sc.nextInt());
        System.out.println("Successfully set your Pin");
        sc.nextLine();
        while(balance!=0)
        {
        System.out.println("1.Insert Card");
        System.out.println("0.Exit");
        int userno;
        userno=sc.nextInt();
        if(userno==1){
                        System.out.println("Enter your Pin");
                        int userpin=sc.nextInt();
                        if(getUserPin()==userpin)
                        {
                            System.out.println("1.Deposit");
                            System.out.println("2.Withdraw");
                            System.out.println("3.Balance");
                            int usernum;
                            usernum=sc.nextInt();
                            if(usernum==1) {
                                    System.out.println("Enter your Deposit Amount:");
                                    int depositAmount;
                                    depositAmount=sc.nextInt();
                                    if(depositAmount>99)
                                    {
                                        balance=depositAmount+balance;
                                        System.out.println("Deposite Amount="+depositAmount);
                                        System.out.println("After Deposite Balance="+balance);
                                    }
                                    else{
                                        System.out.println("Minimum Deposit Amount 100");
                                    }
                                }
                            else if(usernum==2)
                                {
                                    int withdrawAmount;
                                    System.out.println("Enter your Withdraw Amount");
                                    withdrawAmount=sc.nextInt();
                                    if(withdrawAmount<=balance && withdrawAmount>=500)
                                    {
                                        balance=balance-withdrawAmount;
                                        System.out.println("Withdraw Amount="+withdrawAmount);
                                        System.out.println("After Withdraw Balance="+balance);
                                    }
                                    else if(withdrawAmount<500)
                                    {
                                        System.out.println("Minimum Withdraw Amount 500");
                                    }
                                    else
                                    {
                                        System.out.println("Insufficient balance");
                                    }
                        
                                }
                            else if(usernum==3)
                            {
                                int yourbalance=balance;
                                System.out.println("Your Balance ="+yourbalance);
                            
                            }
                        }
                    }
                    if(userno==0)
                        {
                            System.out.println("Thanks for visiting");
                            break;
                        }
        }
    sc.close();
    
    }
}
