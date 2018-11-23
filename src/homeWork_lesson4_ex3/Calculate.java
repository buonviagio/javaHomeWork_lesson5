package homeWork_lesson4_ex3;

public class Calculate {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        String c = args[2];

        double d = Double.parseDouble(a);
        double e = Double.parseDouble(b);
        double f = Double.parseDouble(c);

        result(d, e, f);
    }
    private static void result(double a, double b, double c) {
        System.out.println("Среднее значение трех вещественный чисел, равняется: " + (a+b+c)/3);
    }
}
