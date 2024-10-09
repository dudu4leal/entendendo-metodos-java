public class Mensagem {
    public static void obterMensagem(int hora){

        if (hora>=13 && hora<=18){
            System.out.println("Boa tarde!");
        }else if(hora>=19 && hora<=23){
            System.out.println("Boa noite!");
        }else if(hora>=0 && hora<=4){
            System.out.println("Boa noite!");
        }else if(hora>=5 && hora<=12){
            System.out.println("Bom dia!");
        }else{
            System.out.println("Hora invalida.");
        }
    }
    
}
