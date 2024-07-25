package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단, 자식의 기능은 호출 불가. compile error
        //poly.childMethod();

        //다운캐스팅 (부모 타임 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
        System.out.println(poly);
        System.out.println(child);
    }
}
