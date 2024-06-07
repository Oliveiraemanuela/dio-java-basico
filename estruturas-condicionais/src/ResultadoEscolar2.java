public class ResultadoEscolar2 {
    public static void main(String[] args) {
        
        int nota = 2;

        if(nota > 7)
            System.out.println("Que maravilha, você foi aprovado!");
        else if(nota >= 5 && nota <7)
            System.out.println("Você ainda tem uma chance, está em recuperação!");
        else 
            System.out.println("É, infelizmente não foi dessa vez, estude mais no próximo ano. Você foi reprovado!");
                
    }
}
