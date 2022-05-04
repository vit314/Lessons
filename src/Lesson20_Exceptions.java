
public class Lesson20_Exceptions {

    public static void main(String[] args) {

        checking45();
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Меньше 18 лет - доступ закрыт");
        } else {
            System.out.println("Старше 18 лет - доступ открыт");
        }
    }

    public static void checking45() {
        try {
            for (int i = 40; i <= 60; i++)
                if (i % 4 == 0) {
                    System.out.println(i);
                    if (i > 45) {
                        throw new Exception("Число должно быть меньше 45");
                    }
                }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

