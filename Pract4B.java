class demo{
    demo(){
        System.out.println("Demo constructor");
    }
    protected void finalise(){
        System.out.println("Destroyed");
    }
}
class Pract4B {
    public static void main(String[] args) {
        demo d = new demo();
        d = null; //destroyed
    }
}
