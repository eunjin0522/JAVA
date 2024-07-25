package construct;

public class MemberDefault {
    String name;

/*    public MemberDefault() {
        *//*기본생성자
        * 클래스에 생성자가 없으면 매개변수가 없고 작동하는 코드도 없는 기본 생성자는 자동으로 만들어줌
        * BUT!!! 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다*//*
    }*/

    MemberDefault(){
        System.out.println("생성자호출");
    }
}
