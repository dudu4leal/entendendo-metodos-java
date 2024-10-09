public class Empestimo {
    //public static int getDuasParcelas(){
      //  return 2;
    //} 

    //public static int getTresParcelas(){
      //  return 3;
    //}

    public static double taxaDuasParcelas(){
        return 0.3;
    }

    public static double taxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas==2){
            double valorFinal = valor + (taxaDuasParcelas()*valor);
            System.out.println("Valor final do emprestimo para 2 parcelas: R$ " + valorFinal);
        }else if(parcelas==3){
            double valorFinal = valor + (taxaTresParcelas()*valor);
            System.out.println("Valor final do emprestimo para 3 parcelas: R$ " + valorFinal);
        }else{
            System.out.println("Quantidade de parcelas nao aceita.");
        }
    }
}
