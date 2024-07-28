package codingTest;

public class IntroDay5 {
//     10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인
    public static int solution1(int price) {
        if(price >= 500000){
            return (int)(price*0.8);
        }else if (price >= 300000){
            return (int)(price*0.9);
        }else if(price >= 100000){
            return (int)(price * 0.95);
        }
        return price;
    }
//    배열 순서 뒤집기 - 1
    public static int[] solution4(int[] num_list) {
        for (int i = 0; i < num_list.length/2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length-1-i];
            num_list[num_list.length-1-i] = temp;
        }
        return num_list;
    }
//    배열 순서 뒤집기 - 1
    public static int[] solution5(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[answer.length - i-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.length/2);
    }
}
