package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String arr[] = new String[n];

        for ( int i = 0 ; i<n; i++)
        {
            arr[i] = br.readLine();
        }

        for(int i = 0; i<n; i++)
        {
            int rpt = 0;
            int sum = 0;

            for(int j = 0;j<arr[i].length();i++)
            {
                if(arr[i].charAt(j) == 'O')
                {
                    rpt++;
                }
                else
                {
                    rpt = 0;
                }
                sum+=rpt;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }

}
