 class Pract2B{
    public static void main(String[] args) {
        String a = "1001";
        int p = 9;

        int x = Integer.parseInt(a, 2);
        System.out.println("Decimal of " + a + " is : " + x);

        System.out.println("Binary of " + p + " is : " + Integer.toBinaryString(p));
    }
}
