package Static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instaceValue; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue ++; //정적변수 접근
        staticMethod(); //정적메서드 접근
    }

    public static void staticCall(DecoData data) { //외부에서 참조값을 가져온 상황
        data.instanceValue++;
        data.instanceMethod();

    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = "+instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue = "+staticValue);
    }
}
