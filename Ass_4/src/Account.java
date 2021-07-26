public class Account {
    private String name; //username;
    private int balance; // account balance;


    public Account(String name)
    {
        this.balance = 1000;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBal() {
        return balance;
    }

    public void withdraw(int amount) {

        balance = balance - amount;
    }

/*
    public int getMoney(int money){

		 // Determine whether the account balance is greater than the money to be taken;
        if(this.balance > money ){
            this.balance = this.balance - money;
        }else{
            money = this.balance;
            this.balance = 0;
        }
        //Return the money that was taken out;
        return money;
    }

    public int search(){
        return this.value;
    }


   // public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

 */
}
