package programmers;

import java.util.Scanner;

public class Transrator {

        public int transrator(int n) {
            int answer = 0;

            for (int i = 2; i < n; i++)
            {
               if(n % i == 1)
               {
                   answer = i;
                    break;

               }


            }


            return answer;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Transrator sol = new Transrator();
        int ret = sol.transrator(n);
        System.out.println(ret);

    }
}
