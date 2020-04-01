public class JavaCalc {

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator(10,10);
        System.out.println("Add: "+ sc.add());
        System.out.println("Div: "+ sc.div());
        System.out.println("Sub: "+ sc.sub());
        System.out.println("Mul: "+ sc.mul());

    }
}