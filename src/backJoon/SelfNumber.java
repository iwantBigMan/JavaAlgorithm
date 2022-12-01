package backJoon;

public class SelfNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 10001; i++) {
            int n = d(i);

        }

    }

    public static int d(int number) {
        int sum = number;

        while(number != 0)
        {
            sum = sum + (number % 10); // 첫 째 자리 수
            number = number/10; //10으로 나눠서 첫째 자리수를 없앰


        }
        return sum;
    }
}
