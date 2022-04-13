public class Lesson11 {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 4;
        if(num1 > num2) {
            System.out.println("Первое число больше второго");
        }

//
//        int num1 = 6;
//        int num2 = 4;
//        if(num1>num2){
//            System.out.println("Первое число больше второго");
//        }
//        else{
//            System.out.println("Первое число меньше второго");
//        }
//
//        int num1 = 6;
//        int num2 = 8;
//        if(num1>num2){
//            System.out.println("Первое число больше второго");
//        }
//        else if(num1<num2){
//            System.out.println("Первое число меньше второго");
//        }
//        else{
//            System.out.println("Числа равны");
//        }
//
//        int num1 = 8;
//        int num2 = 6;
//        if(num1 > num2 && num1>7){
//            System.out.println("Первое число больше второго и больше 7");
//        }

//        int num = 8;
//        switch(num){
//
//            case 1:
//                System.out.println("число равно 1");
//                break;
//            case 8:
//                System.out.println("число равно 8");
//                num++;
//                System.out.println(num);
////                break;
//            case 9:
//                System.out.println("число равно 9");
//                break;
//            default:
//                System.out.println("число не равно 1, 8, 9");
//        }
//



        int x=3;
        int y=2;
        int z = x>=y ? (x+y) : (x-y);
        System.out.println(z);

        char c = 'a';
        System.out.println((int)c);

    }

}
