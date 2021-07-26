public class Withdraw {
    private Account account;
    public void getWithdraw(int withdrawAmount) {

        if(account.getBal() >= withdrawAmount) {
            System.out.println(Thread.currentThread().getName()+" withdraw "+withdrawAmount);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {

                e.printStackTrace();
            }
            account.getBal();
            System.out.println(Thread.currentThread().getName());
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

}
