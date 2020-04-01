public class SimpleCalculator extends Calculator {
    public SimpleCalculator(int x, int y) {
        super(x,y);
        System.out.println("Simple Calculator Called");
    }

    public void version() {
        System.out.println("Simple Calculator");
    }

    public void on() {
        System.out.println("Simple Calculator is now ON...");
    }

    public void off() {
        System.out.println("Simple Calculator is now OFF...");
    }
}