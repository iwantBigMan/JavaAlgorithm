package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Maraton {
    public String player(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);

        }
        for (String name : completion)
        {
            map.put(name, map.get(name) - 1);
        }
            for (String key : map.keySet())
            {
                if (map.get(key) > 0)
                {
                    answer = key;
                    break;
                }
            }


            return answer;
        }



    public static void main(String[] args) throws IOException {
        Maraton sol = new Maraton();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        String[] participant = new String[Integer.parseInt(p)];
        String c = br.readLine();
        String[] completion = new String[Integer.parseInt(c)];
        String ret = sol.player(participant, completion);
    }
}
