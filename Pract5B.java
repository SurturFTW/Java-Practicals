class Animal {
    public void displayInfo() {
        System.out.println("I'm in animal class.");
    }
}
 
 class Dog extends Animal {
    public void displayInfo() {
        System.out.println("I'm in dog class.");
    }
}
class Pract5B{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayInfo();
    }
}