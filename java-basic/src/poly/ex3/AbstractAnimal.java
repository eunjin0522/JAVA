package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //자식이 오버라이딩 해야하는 method

    public void move(){ //상속받아서 사용하는 목적 오버라이딩 안 해도 됨
        System.out.println("동물이 움직입니다.");
    }
}
