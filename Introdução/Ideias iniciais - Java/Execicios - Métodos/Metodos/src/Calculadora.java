public class Calculadora {
    public static void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a " + resultado);
    }

    public static void menos(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " + num2 +  " é igual a " + resultado);
    }

    public static void mult(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é igual a " + resultado);
    }

    public static void div(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("A divisão de " + num1 + " / " + num2 + " é igual a " + resultado);
    }
}
