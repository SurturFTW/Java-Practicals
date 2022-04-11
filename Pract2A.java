public class Pract2A {
        public static void main(String[] args) {
        String a = "101";
        String b = "100"; 
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int sum = x + y;
        System.out.println("Addition of binary numbers is " + Integer.toBinaryString(sum));
    }
}
