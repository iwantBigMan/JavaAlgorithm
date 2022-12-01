package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class twoNumber {
    public int[] two(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                int a = numbers[i]+ numbers[j];
                if (list.indexOf(a) < 0)
                {
                    list.add(a);
                }
            }
        }
        int[] answer = new  int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        twoNumber sol = new twoNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int []numbers = new int[num];
        int []ret = sol.two(numbers);
        System.out.println(ret);
    }
}