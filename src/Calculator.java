public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Base Calculator Called");
    }

    public float add() {
        return x + y;
    }
    public float sub() {
        return x - y;
    }
    public float div() {
        return (float)x / y;
    }
    public float mul() {
        return x * y;
    }
    public void version() {
        System.out.println("Base Calculator");
    }
}