public class PacotesInternet {
    public static void main(String[] args) {    
        String plano = "M";

        if(plano == "B") {
            System.out.println("O plano escolhido oferece: ");
            System.out.println("100 minutos de ligação");
        }
            
        
        else if(plano == "M") {
            System.out.println("O plano escolhido oferece: ");
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram grátis");
        } 
                    
        else if(plano == "T"){
            System.out.println("O plano escolhido oferece: ");
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram Grátis"); 
            System.out.println("5 GB de Youtube");
        }
        else        
            System.out.println("Escolha o plano mais adequado para você");    
    }
}
