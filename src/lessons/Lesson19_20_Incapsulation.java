package lessons;

public class Lesson19_20_Incapsulation {

    // ================ ИНКАПСУЛЯЦИЯ ================

        public static void main(String[] args) {
//
//            Person myObj = new Person();
//            myObj.name = "John";  // error
//            System.out.println(myObj.name); // error

            Person myObj = new Person();
            myObj.setName("John"); // Set the value of the name variable to "John"
            System.out.println(myObj.getName());
        }
        }


class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

// ================ ИНКАПСУЛЯЦИЯ ================

