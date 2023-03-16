import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // 1. Создать массив из 10 элементов вывести сумму всех элементов массива.

        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("1. Сумма всех элементов массива: " + Arrays.stream(nums).sum());

        // 2. Создать массив из 10 элементов, вывести сумму элементов с четным индексом.

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) result += nums[i];
        }
        System.out.println("2. Сумма всех элементов массива с четным индексом: " + result);

        // 3. Создать массив, где четные индексы - название месяца, нечётные - количество дней в месяце.
        // Вывести названия месяцев.

        String[] year = new String[24];

        year[0] = "January";
        year[2] = "February";
        year[4] = "March";
        year[6] = "April";
        year[8] = "May";
        year[10] = "June";
        year[12] = "July";
        year[14] = "August";
        year[16] = "September";
        year[18] = "October";
        year[20] = "November";
        year[22] = "December";

        year[1] = year[5] = year[9] = year[13] = year[15] = year[19] = year[23] = "31";
        year[7] = year[11] = year[17] = year[21] = "30";
        year[3] = "28";

        System.out.print("3. Названия месяцев: ");
        for (int i = 0; i < year.length; i += 2) {
            if (i != year.length - 2){
            System.out.print(year[i] + ", ");
            }
            else System.out.print(year[i] + ".");
        }

        // 4. Сдвинуть элементы массива влево на 5 позиций.
        System.out.println();
        List<String> list = Arrays.asList(year);
        Collections.rotate( list, 5);
        System.out.println("4. Элементы массива year, сдвинутые на 5 позиций: " + list);

        // 5.Заполнить двухмерный массив выше главной диагонали единицами, - ниже нулями, диагональ - двойками.
        // Размерность 8×8

        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){

                if (i < j) {
                    arr[i][j] = 1;
                }
                else if (i > j) {
                    arr[i][j] = 0;
                }
                else arr[i][j] = 2;
            }
        }
        System.out.println("5. Двухмерный массив: ");
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);

    }
}
