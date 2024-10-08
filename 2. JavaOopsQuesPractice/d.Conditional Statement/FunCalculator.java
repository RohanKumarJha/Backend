import java.util.*;
public class FunCalculator {
    public static int cube(int value) {
        return value*value*value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int val = num;
        if(choice == 1) {
            System.out.println("Calculate Armstrong");
            System.out.println("Calculate Lucky Number");
            System.out.println("Your Choice is 1");
            int ans = 0;
            while(val != 0) {
                ans = ans+cube(val%10);
                val /= 10;
            }
            if(ans == num) {
                System.out.println("The number "+num+" is an Armstrong number");
            } else {
                System.out.println("The number "+num+" is not an Armstrong number");
            }
        } else if(choice == 2) {
            System.out.println("Calculate Armstrong");
            System.out.println("Calculate Lucky Number");
            System.out.println("Your Choice is 2");
        } else {
            System.out.println("Calculate Armstrong");
            System.out.println("Calculate Lucky Number");
            System.out.println("Oops! Invalid choice!");
        }
    }
}
