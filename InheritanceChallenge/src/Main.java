public class Main {
    public static void main(String[] args) {

//        salariedEmployee max = new salariedEmployee("Max","09/08/1986","09/09/2046",
//                87654,"09/08/2005",60000,false);
//        System.out.println(max);

        Employee tim = new Employee("Tim","11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        salariedEmployee joe = new salariedEmployee("Joe","11/11/1990","03/03/2020",35000);
        System.out.println(joe);
        System.out.println("joe's paycheck = $" +joe.collectPay());

        joe.retire();
        System.out.println("joes check = " + joe.collectPay());


    }
}
