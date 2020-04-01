public class JavaCalc {
    public static float add(int x, int y) {
        return x + y;
    }
    public static float sub(int x, int y) {
        return x - y;
    }
    public static float div(int x, int y) {
        return (float)x / y;
    }
    public static float mul(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println("Add: "+ add(x,y));
        System.out.println("Div: "+ div(x,y));
        System.out.println("Sub: "+ sub(x,y));
        System.out.println("Mul: "+ mul(x,y));
    }
}