package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        //volume up
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        //volume up
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        //volume down
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
