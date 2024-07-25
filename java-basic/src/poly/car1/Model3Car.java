package poly.car1;

public class Model3Car implements Car{
    @Override
    public void starEngine() {
        System.out.println("Model3Car.starEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}
