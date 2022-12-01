package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoadTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer s = null;
        StringBuilder sb = new StringBuilder();

        int q;
        int w;
        for(int i = 0; i<t;i++)
        {
            q = Integer.parseInt(s.nextToken());
            w = Integer.parseInt(s.nextToken());
            s = new StringTokenizer(br.readLine()," ");

            int val = 1;
            for(int j = 0; j < w; j ++);
            {
                val = w % q;
            }

            sb.append(val).append('\n');

            System.out.println(val);
        }


    }
}
