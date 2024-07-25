package poly.ex4;

public class AnimalMain {
    public static void main(String[] args) {
        //추상클래스 생성불가
        //AbstractAnimal animal=  new AbstractAnimal();
        //'AbstractAnimal' is abstract; cannot be instantiated

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAminal(dog);
        soundAminal(cat);
        soundAminal(caw);

        moveAminal(dog);
        moveAminal(cat);
        moveAminal(caw);
    }

    private static void soundAminal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
    private static void moveAminal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("동물 이동 테스트 종료");
    }
}
