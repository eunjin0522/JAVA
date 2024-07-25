package final1;

public class ConstructInit {

    final int value;

    public ConstructInit(int value) {
        this.value = value; //생성자를 통해서 값을 할당 이후 변경 X
                            //final을 필드에서 사용할 경우 생성자를 통해서 값을 초기화 가능
    }
}
