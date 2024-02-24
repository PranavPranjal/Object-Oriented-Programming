public class Employee extends Worker{

    private long employeeid;
    private String hireDate;

    private static int employeeno = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeid = Employee.employeeno++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
