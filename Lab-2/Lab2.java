public class Lab2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Task_21: " + Task_21(-2.54, 1.23, -2.14, -0.23) + "\n");
        System.out.print("Task_12: " + Task_12(1.478, 9.26, 0.68, 2.24) + "\n");
        System.out.print("Task_3: " + Task_3(1.234, -3.12, 5.45, 2.0) + "\n");
    }

    public static double Task_3(double a, double b, double c, double d) throws Exception {
        double result = 0;

        double firstPart = 2 * Math.sin(a);
        double secondPart = Math.cos(Math.abs(b * Math.sqrt(c)));

        result = Math.pow(firstPart + secondPart, d);

        return result;
    }

    public static double Task_12(double a, double b, double c, double d) throws Exception {
        double result = 0;

        double firstPart = 6 * Math.pow(Math.sin(Math.abs(2 * a)), Math.log10(b)); 
        double secondPart = 6 * Math.sqrt(c * Math.cosh(-d));

        result = firstPart + secondPart;

        return result;
    }

    public static double Task_21(double a, double b, double c, double d) throws Exception {
        double result = 0;

        double firstPart = 3 * Math.log(Math.abs(a / b));
        double secondPart = 3 * Math.sqrt(Math.cos(c) + Math.exp(d));

        result = firstPart + secondPart;

        return result;
    }
}