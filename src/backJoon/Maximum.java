package backJoon;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = arr[0];
        int index = 0;

        for(int i = 0; i<9;i++)
        {
            arr[i] = sc.nextInt();
        }

            for(int i = 0; i < 9; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                    index = i+1;
                }
            }
                System.out.print(max + "\n" + index);
    }
}