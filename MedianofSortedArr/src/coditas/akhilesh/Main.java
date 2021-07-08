package coditas.akhilesh;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = ArrayInput();
        int[] arr2 = ArrayInput();
        int[] merge = new int[arr1.length + arr2.length];

        int position = 0;
        for (int i : arr1) {
            merge[position] = i;
            position++;
        }
        for (int i: arr2) {
            merge[position] = i;
            position++;
        }

        Arrays.sort(merge);
        int len = merge.length;
        System.out.println("The merged and sorted array : ");
        System.out.print(Arrays.toString(merge));
        double median;
        if (len%2!=0){
            median = merge[len/2];
        }
        else{
        }
    }

    public static int[] ArrayInput(){
        System.out.print("Enter size of array: ");
        int sizeArr = scan.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.print("Enter element in position "+i+" : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
}
