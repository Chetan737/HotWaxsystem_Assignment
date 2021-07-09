public class Account {
    private String name; //username;
    private int value; // account balance;

    public void putMoney(int money){
        this.value = this.value + money;
    }


    public int getMoney(int money){

		 // Determine whether the account balance is greater than the money to be taken;
        if(this.value > money ){
            this.value = this.value - money;
        }else{
            money = this.value;
            this.value = 0;
        }
        //Return the money that was taken out;
        return money;
    }


    public int search(){
        return this.value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
