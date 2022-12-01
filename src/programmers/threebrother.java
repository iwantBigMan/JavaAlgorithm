package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threebrother {
    public int three(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; i++) {
                for (int z = j + 1; z < number.length; i++) {
                    if (number[i] + number[j] + number[z] == 0)
                        answer++;
                }
            }
        }


        return answer;
    }




    public static void main(String[] args) throws IOException {
        threebrother sol = new threebrother();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[n];
        int ret = sol.three(number);
        System.out.println(ret);

    }
}
