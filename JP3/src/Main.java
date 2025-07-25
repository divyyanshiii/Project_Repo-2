 interface Animal {
    void speak();
    void eat(String food);
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Woof! Woof!");
    }

    public void eat(String food) {
        System.out.println("The dog is eating " + food + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.speak();
        myDog.eat("bone");
    }
}
