public class OutroPacoteInternet {
// Modo condicional switch/case
	public static void main(String[] args) {
		String plano = "A"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
            default:
                System.out.println("Opção inválida");
		}
	}
}

