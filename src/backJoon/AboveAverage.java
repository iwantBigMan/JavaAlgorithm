package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AboveAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        int index = 0;
        int [] arr;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];

            double sum = 0;


            for (int j = 0; j < n; j++)
            {
                int s = Integer.parseInt(st.nextToken());
                arr[j] = s;
                sum += s;
            }
            double mean = (sum/n);
            double A = 0;

            for(int j = 0; j < n; j++)
            {
                if(arr[j]>mean)
                {
                    A++;
                }
            }
            System.out.printf("%.3f%%\n",(A/n)*100);

        }



    }
}
