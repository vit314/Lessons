class Lesson_20 {

    int years;
    String name;

    public Lesson_20() {
        years = 50;
        name = "Ed";
    }

    public static void main(String[] args) {
        Lesson_20 lesson_20 = new Lesson_20();
        System.out.println(lesson_20.name);

        Lesson_20 lesson21 = new Lesson_20();
        System.out.println(lesson21.years);
    }


}
