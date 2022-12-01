package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parseint {
    public int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args)throws IOException {
        Parseint sol = new Parseint();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ret = sol.parse(s);
        System.out.println(s);
    }
}
