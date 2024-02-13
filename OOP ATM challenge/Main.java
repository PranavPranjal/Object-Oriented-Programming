public class Main {
    public static void main(String[] args) {
//        Account tom = new Account(1,500.00,"Tom Phil","tom@z.com",90876590);
        Account tom = new Account();

        System.out.println(tom.getAccountNum());
        System.out.println(tom.getAccountBal());
//        tom.setAccountNum(1);
//        tom.setCustomerName("TOM");
//        tom.setAccountBal(1000);
//        tom.setCustomerEmail("tom@gmail.com");
//        tom.setPhoneNum(999999999);

//        System.out.println(tom.getAccountBal());

        tom.depositFunds(1000);
        tom.withdrawFunds(50.99);

        Account bill = new Account("BILL","tim@z.com",12345);
        System.out.println("Acc no: " + bill.getAccountNum() +
                "; name " + bill.getCustomerName()
                );
    }
}
