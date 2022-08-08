package forexam;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 500);

//        car1.driveMaxSpeed();
//        car2.driveMaxSpeed();
//        car3.driveMaxSpeed();
//        car4.driveMaxSpeed();
//        car5.driveMaxSpeed();

        Car[] cars1 = new Car[5];
        cars1[0] = new Car("페라리", 300);
        cars1[1] = new Car("람보르기니", 350);
        cars1[2] = new Car("롤스로이스", 250);
        cars1[3] = new Car("부가티베이론", 400);
        cars1[4] = new Car("포터", 500);

        Car[] cars2 = {
                new Car("페라리", 300),
                new Car("람보르기니", 350),
                new Car("롤스로이스", 250),
                new Car("부가티베이론", 400),
                new Car("포터", 500)
        };

        for (Car car : cars2) {
            car.driveMaxSpeed();
        }
    }
}
