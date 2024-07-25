package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();  //Animal dog = new Dog(); 타입을 Animal로 해도 됨
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal duck=  new Duck();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) { //부모는 자식을 품을 수 있다!
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
