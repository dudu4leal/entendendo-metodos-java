public class Calculadora {
    
    
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " eh igual a " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;

        System.out.println("A diferenca entre " + numero1 + " e " + numero2 + " eh igual a " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.println("O produto de " + numero1 + " e " + numero2 + " eh igual a " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;

        System.out.println("A divisao entre " + numero1 + " e " + numero2 + " eh igual a " + resultado);
    }
    
}
