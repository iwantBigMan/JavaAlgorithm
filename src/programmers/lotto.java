package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lotto {
    public int[] l(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero  = 0;
        for(int i = 0; i < lottos.length; i++)
        {

            if (lottos[i] == 0)
            {
                zero++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++)
            {
                if(lottos[i] == win_nums[j])
                {
                    count++;
                    break;
                }

            }
        }

        answer[0] = Rank(count + zero);
        answer[1] = Rank(count);



        return answer;
    }


    public static int Rank(int n)
    {
        switch (n){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }

    }

    public static void main(String[] args) throws IOException {
    lotto sol = new lotto();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int win = Integer.parseInt(br.readLine());
    int []win_nums = new int[win];
    int l = Integer.parseInt(br.readLine());
    int []lottos = new int[l];
    int [] ret = sol.l(lottos, win_nums);
        System.out.println(ret);
    }
}
