package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dispersion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int a;
        int b;
        for(int i = 0; i < n; i++ )
        {
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int f = 1;
            for(int j = 0; j < b; j++)
            {
                f = (a*f)%10;
            }
            if(f == 0)
            {
                f = 10;
            }
            sb.append(f).append('\n');

        }
        System.out.println(sb);

    }
}
