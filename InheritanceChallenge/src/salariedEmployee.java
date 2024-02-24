public class salariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public salariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;

    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired)? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retire(){
        System.out.println(isRetired);
        terminate("12/12/2025");
        isRetired = true;

    }

//    @Override
//    public String toString() {
//        return "salariedEmployee{" +
//                "annualSalary=" + annualSalary +
//                ", isRetired=" + isRetired +
//                "} " + super.toString();
//    }
}
