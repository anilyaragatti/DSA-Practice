package TwodArray;

import java.util.*;

public class start {

    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.print("THE KEY IS FOUND AT "+"["+i+","+j+"]");
                    return true;
                }
            }
        }
        System.out.println("THE KEY IS NOT FOUND");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3, m = 3;
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("the matrix is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        search(arr, 6);
        sc.close();
    }

}