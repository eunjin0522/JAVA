package array;

public class ArrayRef4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //new int[] 생략 가능 but, 배열 변수 선언과 동시에 배열 생성,초기화

        // System.out.println(students.length);  .length는 배열의 길이

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
                                    // i + 1을 묶지 않으면 1을 문자로 인식함, 괄호로 묶어서 i와의 계산을 우선시

        }
    }
}
