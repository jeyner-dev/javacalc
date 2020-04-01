public class JavaCalc {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        SimpleCalculator sc = new SimpleCalculator();
        sc.on();
        System.out.println("Add: "+ sc.add(x, y));
        System.out.println("Div: "+ sc.div(x, y));
        System.out.println("Sub: "+ sc.sub(x, y));
        System.out.println("Mul: "+ sc.mul(x, y));
        sc.clear();
        sc.off();

    }
}