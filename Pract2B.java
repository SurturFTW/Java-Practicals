 class Pract2B{
    public static void main(String[] args) {
        //binary numbers
        String a = "1001";
        //decimal numbers
        int p = 9;

        //binary to decimal
        int x = Integer.parseInt(a, 2);
        System.out.println("Decimal of " + a + " is : " + x);

        //decimal to binary
        System.out.println("Binary of " + p + " is : " + Integer.toBinaryString(p));
    }
}
