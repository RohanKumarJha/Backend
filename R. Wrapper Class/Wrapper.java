public class Wrapper {
    public static void main(String[] args) {
        int num = 23;
        Integer obj = num;
        System.out.println(obj); //AutoBoxing
        int val = obj;
        System.out.println(val); //AutoUnboxing
    } 
}