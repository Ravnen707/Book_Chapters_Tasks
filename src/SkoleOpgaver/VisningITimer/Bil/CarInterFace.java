package SkoleOpgaver.VisningITimer.Bil;

public class CarInterFace {
    public static void main(String[] args) {
        Car car = new Car();
        CarKey key = new CarKey("password1234");
        car.turncaron(key);
        car.setHandbrake(false);
        car.carLight(false);
        car.setCurrentspeed((int)car.setspeed(12,4.8));
        car.setHandbrake(true);
        car.carLight(true);
        car.turncaroff(key);
    }


}
