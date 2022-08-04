package whiletest.ex03;

public class Main {
    public static void main(String[] args) {
        int num = 2;

        while (num <= 9) {
            int i = 1;
            while (i <= 9) {
                System.out.printf("%d * %d = %d%n", num, i, num*i);
                i++;
            }
            System.out.println("=================================");
            num++;
        }
    }
}
