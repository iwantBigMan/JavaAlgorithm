package programmers;

public class count {
    public int solution3(int[] scores) {

        int count = 0;
        for (int i = 0; i < scores.length; i++)
            if (650 <= scores[i] && scores[i] < 800)
                count += 1;
        return count;
    }
    //     // 아래는 테스트케이스 출력을 해보기 위한 main 함수입니다. solution 함수를 수정하세요.
    public static void main(String[] args) {
        count sol = new count();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution3(scores);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
