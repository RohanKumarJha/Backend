import employee.*;

public class EmployeeRecords{
    public static void main(String[]args) {
        //TO-DO: Create an instance of PermanentEmployee and ContractEmployee.
        //TO-DO: Populate the objects with the inputs given below.
        //TO-DO: Invoke the calculateSalary method using both the objects.
        //TO-DO: Display the salary of both permanent and contract employee.

        PermanentEmployee obj1 = new PermanentEmployee();
        obj1.setName("Anil");
        obj1.setEmpId(101);
        obj1.setBasicPay(10000);
        obj1.setHra(1500);
        obj1.setExperience(5);
        obj1.calculateSalary();
        System.out.println("Permanent Employee: Your salary is: "+obj1.getSalary());

        ContractEmployee obj2 = new ContractEmployee();
        obj2.setName("Ankit");
        obj2.setEmpId(102);
        obj2.setWages(500);
        obj2.setHours(10);
        obj2.calculateSalary();
        System.out.println("Contract Employee: Your salary is: "+obj2.getSalary());
    }
}   

