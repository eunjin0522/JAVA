package codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Day3 입문
//1    배열에서 중간 값 찾기
class Solution1{
    public int solution1(int[] array) {
//        for(int i=1;i<array.length;i++){
//            for(int j=0;j<array.length-i;j++){
//                if(array[j]>=array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
        Arrays.sort(array); //오름차순 정렬
        int answer = array[array.length/2];
        return answer;
    }
}
public class IntroDay3 {
//    최빈값 구하기  최빈값이 여러 개면 -1을 return ***JJOGGAN
    public static int solution2(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int num : array){
            //getOrDeFault : 찾는 키가 존재하면 키 값 반환. 없다면 기본키 반환
            //defaultValue : 지정된 키로 매핑된 값이 없을 경우 반환할 값
            int count = map.getOrDefault(num,0)+1; // 키값에 1증가해서 넣기

            if(count > maxCount){
                maxCount = count;
                answer = num;
            }else if(count == maxCount){
                answer = -1;
            }

            map.put(num,count);
        }

        return answer;
    }
//4 n보다 작은 홀수 값만 배열에 넣기
    public static int[] solution4(int n) {
        int[] answer = new int [n/2+n%2];
        int count = 0 ;
        for(int i = 1; i<= n ;i +=2){
            answer[count] = i;
            count ++;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {6,7,9,1,5,1,3,7,8,1}; //가운데 값 : 6
        int result1=new Solution1().solution1(arr1);
        System.out.println(result1);
        System.out.println(Arrays.toString(arr1));
        int result2=solution2(arr1);
        System.out.println(result2);
        int[] result4 = solution4(18);
        System.out.println(Arrays.toString(result4));

    }

}
