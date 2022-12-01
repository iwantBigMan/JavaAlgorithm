package programmers;

import java.util.Scanner;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <=right;i++)
        {
            int temp = 0;
            for(int j = 1; j <= i / 2; i++)
            {
                if(i%j == 0)
                {
                    temp++;
                }
            }
            answer += temp % 2 == 0 ? i : -i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int ret = sol.solution(left, right);
        System.out.println(ret);
    }
}
