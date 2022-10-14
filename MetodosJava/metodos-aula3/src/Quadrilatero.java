public class Quadrilatero {
    public static double area(double lado) {
        return (lado * lado);
    }
    
    public static double area(double lado1, double lado2) {
        return (lado1 * lado2);
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diag1, float diag2) {
        return (diag1 * diag2) / 2;
    }
}
