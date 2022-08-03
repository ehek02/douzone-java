package 세미나;

public class 메서드의생명주기 {
    void methodA() {
        System.out.println("method A called");
    }

    void methodB() {
        System.out.println("method B called");
    }
}


class Shell {
    public static void main(String[] args) {
        메서드의생명주기 lifeCycle = new 메서드의생명주기();
        System.out.println("start");
        lifeCycle.methodA();
        lifeCycle.methodB();
        System.out.println("end");
    }
}