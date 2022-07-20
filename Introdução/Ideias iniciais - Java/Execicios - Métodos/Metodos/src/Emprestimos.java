public class Emprestimos {

    public static double taxaDuasParcelas(){
        return 0.2;
    }
    public static double taxaTresParcelas() {
        return 0.3;
    }
    public static double taxaQuatroParcelas() {
        return 0.4;
    }

    public static void calculo(double valor, int parcelas){
        if (parcelas==2){
           double valorFinal = valor + (valor * taxaDuasParcelas());
           System.out.println("O valor final de duas parcelas é: " + valorFinal);
        }else if (parcelas==3){
            double valorFinal = valor + (valor * taxaTresParcelas());
            System.out.println("O valor final de três parcelas é: " + valorFinal);
        } else if (parcelas==4){
            double valorFinal = valor + (valor * taxaQuatroParcelas());
            System.out.println("O valor final de quatro parcelas é: " + valorFinal);
        }else{
            System.out.println("Número de parcelas invalido");
        }
    }

}
