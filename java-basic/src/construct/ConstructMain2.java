package construct;

public class ConstructMain2 {
    public static void main(String[] args) {

        //생성자  객체를 생성함과 동시에 불러내라
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",13);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("name: " + s.name + ", age: " + s.age + ", grade: " + s.grade);

        }
    }
}
