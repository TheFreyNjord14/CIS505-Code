package Module_1.Fan;

public class TestFanApp {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(2, true, 0.01, "black");

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
