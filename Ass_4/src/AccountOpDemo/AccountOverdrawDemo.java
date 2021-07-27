package AccountOpDemo;

import Model.Account;

public class AccountOverdrawDemo implements Runnable{
    private Account account;
    //AccountOpDemo.Withdraw w=new AccountOpDemo.Withdraw();

    public AccountOverdrawDemo(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 4 ; i++) {

            getWithdraw(400);
            if(account.getBal() < 1000) {
                System.out.println(" Insufficient Fund Exceed Limit : *****");
                break;
            }
        }
    }

    public void getWithdraw(int withdrawAmt) {

        if(account.getBal() >= withdrawAmt) {
            System.out.println(Thread.currentThread().getName()+" "+withdrawAmt+"Rs.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            account.withdraw(withdrawAmt);
            System.out.println(Thread.currentThread().getName()+" withdrawl of :"+withdrawAmt);
        }
        else {
            System.out.println("** Insufficient Balance, Your balance is "+account.getBal());
        }
    }

    public static void main(String[] args) {
        //Model.Account acc=new Model.Account();
        Account myAccount = new Account(Thread.currentThread().getName());
        AccountOverdrawDemo objAOD = new AccountOverdrawDemo(myAccount);


        System.out.print("*** Without Synchronization ***\n");
        Thread t1 = new Thread(objAOD);
        t1.setName("Chetan : ");
        Thread t2 = new Thread(objAOD);
        t2.setName("Yash : ");

        //Starting Thread
        t1.start();
        t2.start();
    }
}
