class animal{
    String dog = "Dog Type:";
}

class dog extends animal{
    String type = "Golden Retriever";
}

class Pract5A {
    public static void main(String[] args) {
        dog d = new dog();
        System.out.println(d.dog);
        System.out.println(d.type);
    }
}
