package poly.car1;



public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);   //setCar의 파라미터는 Car car이다. K3Car는 자식 클래스 이다!!
        driver.drive();

        //차량 변경  (K3->Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        //차량 변경  (Model3->NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
