package atv01;

public class TestaBrinquedo {
	
	    public static void main(String[] args) {
	        
	        Brinquedo brinquedo1 = new Brinquedo();
	        brinquedo1.setNome("Carrinho");
	        brinquedo1.setPreco(29.90);
	        brinquedo1.setFaixaEtaria("3 a 5");
	        /*System.out.println("Nome: " + brinquedo1.getNome());
	        System.out.println("Preço: " + brinquedo1.getPreco());
	        System.out.println("Faixa Etária: " + brinquedo1.getFaixaEtaria());*/
	        System.out.println(brinquedo1.mostrar());

	        
	        Brinquedo brinquedo2 = new Brinquedo("Boneca", 45.50, "6 a 10");
	        /*System.out.println("\nNome: " + brinquedo2.getNome());
	        System.out.println("Preço: " + brinquedo2.getPreco());
	        System.out.println("Faixa Etária: " + brinquedo2.getFaixaEtaria());*/
	        System.out.println(brinquedo2.mostrar());

	       
	        brinquedo2.setFaixaEtaria("15 a 20");
	        System.out.println("\nFaixa Etária (inválida): " + brinquedo2.getFaixaEtaria());
	    }
}
