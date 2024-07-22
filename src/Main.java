import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задаче №1");

        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));

        double[] weight2 = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        System.out.println(Arrays.toString(weight2));

        int[] weight3 = new int[24];
        for (int i = 0; i < weight3.length; i++) {
            weight3[i] = i + 1;
            if (i == weight3.length - 1) {
                System.out.println(weight3[i]);
                break;
            }
            System.out.print(weight3[i] + ", ");
        }

        System.out.println();
        System.out.println("Задача №2");

        for (int index = 0; index < weight.length; index++) {
            if (index == weight.length - 1) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + ", ");
        }
        for (int index = 0; index < weight2.length; index++) {
            if (index == weight2.length - 1) {
                System.out.println(weight2[index]);
                break;
            }
            System.out.print(weight2[index] + ", ");
        }
        for (int index = 0; index < weight3.length; index++) {
            if (index == weight3.length - 1) {
                System.out.println(weight3[index]);
                break;
            }
            System.out.print(weight3[index] + ", ");
        }

        System.out.println();
        System.out.println("Задача №3");

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println();

        for (int i = weight2.length - 1; i >= 0; i--) {
            System.out.print(weight2[i] + ", ");
        }
        System.out.println();

        for (int i = weight3.length - 1; i >= 0; i--) {
            System.out.print(weight3[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача №4");

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length;  i ++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
                System.out.print(arr[i] + ", ");
            }
            System.out.print(arr[i] + ", ");
        }


    }
}