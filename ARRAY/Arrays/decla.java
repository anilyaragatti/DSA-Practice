 package Arrays;

import java.util.Scanner;

public class decla {
 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[5];

      arr[0]=sc.nextInt();
      arr[1]=sc.nextInt();
      arr[2]=sc.nextInt();

      System.out.println("phy " + arr[0]);
      System.out.println("chem " + arr[1]);
      System.out.println("math " + arr[2]);


      int percentage = (arr[0]+arr[1]+arr[2])/arr.length;
      System.out.println("the percentage is "+ percentage + "%");

      sc.close();


    }
 }