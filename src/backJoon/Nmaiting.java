package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nmaiting {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for(int i = n;i>0;i--)
        {
            if(n <=100000)
            {
                System.out.println(i);
            }
        }
    }
}
