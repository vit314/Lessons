public class Lesson15_16 {
    public static void main(String[] args) {
//        int[][] nums = new int[][]
//                {
//                        {1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}
//                };
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//
//                System.out.printf("%d ", nums[i][j]);
//            }
//            System.out.println();


        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);


    }
}


