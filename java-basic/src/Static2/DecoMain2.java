package Static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";
        String deco = DecoUtil2.deco(s); //인스턴스를 생성하지 않고 바로 생성

        System.out.println("before :" + s);
        System.out.println("after :" + deco);
    }
}
