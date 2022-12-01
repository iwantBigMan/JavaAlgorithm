package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostGymSuit {
    public int gymsuit(int n, int[] lost, int[] reserve) {
        int answer = 0;
        for(int i = 1; i <=n; i++)
        {
            for(int j = 0; j < lost.length; j++)
            {

            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        LostGymSuit sol = new LostGymSuit();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int[]lost = new int[l];
        int[]reserve = new int[r];

        int ret = sol.gymsuit(n, lost, reserve);
    }
}
