package codingTest;

public class Solution {
//      정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
    public static int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
    public int solution2(int num1, int num2) {

        int answer = (int)((float)num1/(float)num2*1000);
        return answer;
    }

//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
    public int solution3(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }


    public static void main(String[] args) {
            int number3= numer1 * denom2 + numer2 * denom1; //분자
            int denom3 = denom1 * denom2; //분모

            for(int i = 1 ; i <= number3 && i <= denom3;i++){ //0으로 나눌 수 없으니 1부터 시작
                if(number3%i == 0 && denom3%i == 0){
                    number3  = number3 / i;
                    denom3 =  denom3 / i;
                }
            }
            int[] answer = {number3,denom3};
    }
}
