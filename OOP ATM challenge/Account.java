public class Account {
    private int accountNum;
    private double accountBal;
    private String customerName;
    private String customerEmail;
    private int phoneNum;

    public Account(){
        this(85467,200.00,"Default","def@z.com",987654321);
        System.out.println("Empty constructor called");
    }

    public  Account(int accountNum,Double accountBal, String customerName, String email, int phone){
        System.out.println("Account constructor with parameters called");
        this.accountNum = accountNum;
        this.accountBal = accountBal;
        this.customerName = customerName;
        customerEmail = email;
        phoneNum= phone;
    }

    public Account(String customerName, String customerEmail, int phoneNum) {
        this(56546,20.55,customerName, customerEmail, phoneNum);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.phoneNum = phoneNum;
    }

    public int getAccountNum(){
        return accountNum;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    public void setAccountBal(int accountBal) {
        this.accountBal = accountBal;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void depositFunds(double amountdp){

        accountBal = accountBal + amountdp;
        System.out.println("Deposit of " + amountdp +" done." +
                " Available balance is " + accountBal);
    }

    public void withdrawFunds(double amountwd){
        System.out.println("Amount to withdraw " + amountwd);
        if (amountwd > accountBal){
            System.out.println("Not Allowed");
        }
        else {accountBal = accountBal - amountwd;
        System.out.println("Remaining balance is " + accountBal);
        }
    }
}

