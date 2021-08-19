package AccountOpDemo;

import Model.Account;

public class AccountOverdrawSafeDemo implements Runnable{
    private Account account;

    public AccountOverdrawSafeDemo(Account account) {
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

    private  synchronized void  getWithdraw(int withdrawAmt) {

        if(account.getBal() >= withdrawAmt) {

            try {
                Thread.sleep(3000);
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

        Account myAccount = new Account(Thread.currentThread().getName());

        AccountOverdrawSafeDemo demoAccountSafeOverdraw = new AccountOverdrawSafeDemo(myAccount);
        System.out.print("*** Synchronization ***\n");
        Thread t1 = new Thread(demoAccountSafeOverdraw);
        t1.setName("Chetan");

        Thread t2 = new Thread(demoAccountSafeOverdraw);
        t2.setName("Yash");

        t1.start();

        t2.start();


    }
}
