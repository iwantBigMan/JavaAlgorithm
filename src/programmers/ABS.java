package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABS {
    public int abs(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i <= absolutes.length; i++)
        {
            if (signs[i] == true)
            {
                answer += absolutes[i];
            }
            if(signs[i] == false)
            {
                answer -= absolutes[i];
            }

        }

            return answer;
    }



    public static void main(String[] args) throws IOException {
        ABS sol = new ABS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int [] absolutes = new int[num2];
        boolean[] signs = new boolean[num];
        int ret = sol.abs(absolutes, signs);
        System.out.println(ret);
    }
}
