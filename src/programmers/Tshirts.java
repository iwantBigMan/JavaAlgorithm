package programmers;

import java.util.Arrays;

public class Tshirts
{
    public int[] solution(String[] shirtSize) {
        int[] answer = new int[6];
        for(int i = 0; i<shirtSize.length;++i)
        {
            if(shirtSize[i].equals("XS"))
                answer[0]++;
            else if (shirtSize[i].equals("S"))
                answer[1]++;
            else if (shirtSize[i].equals("M"))
                answer[2]++;
            else if (shirtSize[i].equals("L"))
                answer[3]++;
            else if (shirtSize[i].equals("XL"))
                answer[4]++;
            else if (shirtSize[i].equals("XXL"))
                answer[5]++;
        }
        return answer;
    }
    public static void main(String[] args) {
         Tshirts sol = new Tshirts();
        String[] shirtSize = {"XS", "S", "M", "L", "XL", "XXL"};
        int[] ret = sol.solution(shirtSize);

        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");


    }
}
