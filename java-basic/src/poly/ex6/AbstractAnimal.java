package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상
    public void move(){ //상속 목적
        System.out.println("동물이 이동합니다.");
    }
}
