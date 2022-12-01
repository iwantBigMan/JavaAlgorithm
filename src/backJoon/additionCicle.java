package backJoon;
import java.util.Scanner;
public class additionCicle {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       // System.out.print("정수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int count = 0;

        while (true)
        {
            int left = temp / 10;
            int right = temp % 10;
            temp = right * 10 + (right + left) % 10;
            count++;
            if(n==temp)
            {
                break;
            }

        }
        System.out.println(count);
    }
}
