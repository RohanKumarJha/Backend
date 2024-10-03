
public class ReverseCalculator {

    public static void main(String[] args) {
        int num = 23;

        // Using For Loop
        // int ans = 0;
        // for(int i=num; i>0; i/=10) {
        //     ans = ans*10+(num%10);
        //     num /= 10;
        // }
        // System.out.println(ans);

        // Using While loop
        // int ans = 0;
        // while(num != 0) {
        //     ans = ans*10+(num%10); 
        //     num /= 10;
        // }
        // System.out.println(ans);

        // Do-while loop
        int ans=0;
        do {
            ans = ans*10+(num%10); 
            num /= 10;
        } while(num !=0);
        System.out.println(ans);
    }
}