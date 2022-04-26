package lessons;

public class Lesson19_20_Abstract {
    public static void main(String[] args) {
        AbstractPig myPig = new AbstractPig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Abstract class
abstract class AbstractAnimal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class AbstractPig extends AbstractAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}


