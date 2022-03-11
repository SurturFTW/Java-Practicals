interface animal{
    String animal = "Cat";
}

class cat implements animal{
    String sound = "Meow";
}

class display extends cat{
    void show(){
        System.out.println("Animal: " + animal);
        System.out.println("Sound: " + sound);
    }
}

class Pract5C {
    public static void main(String[] args) {
        display d = new display();
        d.show();
    }
}
