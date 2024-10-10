public class Tester {
    public static void main(String[] args) {
        int num = 45687;
        String str = String.valueOf(num);
        StringBuffer sb = new StringBuffer(str);
        System.out.println("String buffer = "+sb);
        sb.reverse();
        System.out.println("String buffer after reversing = " + sb);
    }
}
