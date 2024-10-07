
public class EmployeeRecord {
    public static void main(String[] args) {
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        int n = salaries.length;
        double avgSalary=0,sum=0;
        for(int i=0; i<n; i++) {
            sum += salaries[i];
        }
        avgSalary = sum/n;
        int lesser=0, greater=0;
        for(int i=0; i<n; i++) {
            if(salaries[i] > avgSalary) greater++;
            else lesser++;
        }
        System.out.println("The average salary of the employee is : "+avgSalary);
        System.out.println("The number of employees having salary greater than the average is : "+greater);
        System.out.println("The number of employees having salary lesser than the average is : "+lesser);
    }
}