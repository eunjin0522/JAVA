package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //volume up
        player.volumeUp();
        //volume up
        player.volumeUp();
        //volume down
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();
        //음악 끄기
        player.off();
    }
}
