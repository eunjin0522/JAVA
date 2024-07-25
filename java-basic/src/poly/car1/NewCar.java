package poly.car1;

public class NewCar implements Car{
    @Override
    public void starEngine() {
        System.out.println("NewCar.starEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
