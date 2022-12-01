package programmers;

public class ABC {
    public String solution4(String characters){
        String result = "";
        result += characters.charAt(0);
        for (int i = 1; i < characters.length(); i++) {
            if (characters.charAt(i - 1) != characters.charAt(i))
                result += characters.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        ABC sol = new ABC();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution4(characters);


        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

