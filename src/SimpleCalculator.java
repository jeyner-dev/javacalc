public class SimpleCalculator implements Calculator {

    public float add(int x, int y) {
        return x + y;
    }
    public float sub(int x, int y) {
        return x - y;
    }
    public float div(int x, int y) {
        return (float) x / y;
    }
    public float mul(int x, int y) {
        return x * y;
    }
    public void clear() {
        System.out.println("Clearing Memory...");
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