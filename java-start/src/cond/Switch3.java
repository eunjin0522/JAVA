package cond;

public class Switch3 {
    public static void main(String[] args) {

        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:         //break가 없으면 다음 case를 실행 하게 됨 또한, 해당 case에 지정된 코드도 실행하지 않음
                //coupon = 2000;
                //break;
            case 3:         //등급이 2나 3일 경우 쿠폰 3000 지급
                coupon = 3000;
                break;      //마지막 case에도 break가 없는 경우 default에 있는 코드가 실행됨
            default:
                coupon = 500;
        }

        System.out.println("발급 받은 쿠폰 : " + coupon);
    }
}
