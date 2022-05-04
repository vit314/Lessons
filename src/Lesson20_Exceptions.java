
public class Lesson20_Exceptions {

    public static void main(String[] args) {
        checkAge(19);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Меньше 18 лет - доступ закрыт");
        }
        else {
            System.out.println("Старше 18 лет - доступ открыт");
        }

    }
}
