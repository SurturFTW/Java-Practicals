abstract class dog{
    abstract void catType();
    void dogType(){
        System.out.println("Golden Retriever");
    }
}

class cat extends dog{
    void catType(){
        System.out.println("Persian");
    }
}

public class Pract4C {
    public static void main(String[] args) {
        cat c = new cat();
        c.dogType();
        c.catType();
    }
}