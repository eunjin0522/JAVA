package poly.ex3;

public class AnimalMain {
    public static void main(String[] args) {
        //추상클래스 생성불가
        //AbstractAnimal animal=  new AbstractAnimal();
        //'AbstractAnimal' is abstract; cannot be instantiated

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        cat.sound();
        cat.move();

        soundAminal(dog);
        soundAminal(cat);
        soundAminal(caw);
        soundAminal(duck);

    }

    private static void soundAminal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
