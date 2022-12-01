package programmers;

public class Rank {
    public int solution2(int price, String grade) {

        int answer = 0;
        if(grade.equals("S"))
        {
            answer = (int) (price * 0.95);
        }
        if (grade.equals("V"))
        {
            answer = (int) (price * 0.9);
        }
        if (grade.equals("G"))
        {
            answer = (int) (price * 0.85);
        }

        return answer;
    }

        // 아래는 테스트케이스 출력을 해보기 위한 main 함수입니다.
        public static void main (String[]args){
            Rank sol = new Rank();
            int price1 = 2500;
            String grade1 = new String("V");
            int ret1 = sol.solution2(price1, grade1);

            System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

            int price2 = 96900;
            String grade2 = new String("S");
            int ret2 = sol.solution2(price2, grade2);

            System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        }
    }



