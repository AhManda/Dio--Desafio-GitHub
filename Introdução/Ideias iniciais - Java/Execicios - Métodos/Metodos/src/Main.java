public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Calculadora funcionando");
        Calculadora.soma(10, 30);
        Calculadora.menos(15, 8);
        Calculadora.mult(4, 9);
        Calculadora.div(6.5, 5.2);

        // Cumprimento
        System.out.println("Mensagem de cumprimento");
        Cumprimento.queHoras(8);
        Cumprimento.queHoras(16);
        Cumprimento.queHoras(20);
        Cumprimento.queHoras(4);

        // Empréstimo
        System.out.println("Faça seu empréstimo");
        Emprestimos.calculo(1500,2);
        Emprestimos.calculo(1500,3);
        Emprestimos.calculo(1500,4);
        Emprestimos.calculo(1500,5);

    }
}