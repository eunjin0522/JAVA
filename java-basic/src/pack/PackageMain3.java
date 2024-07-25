package pack;


import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 같은 이름일 경우 import는 하나만 가능 나머지는 전체경로를 적어야함
        // 자주 쓰는 클래스를 import하고 나머지를 전체 경로를 적어주면 됨
    }
}
