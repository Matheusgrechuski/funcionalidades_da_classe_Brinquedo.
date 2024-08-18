package atv01;

public class Brinquedo {
	
	 	private String nome;
	    private double preco;
	    private String faixaEtaria;

	    public Brinquedo() {
	    }
	    
	    public Brinquedo(String nome, double preco, String faixaEtaria) {
	        this.nome = nome;
	        this.preco = preco;
	        setFaixaEtaria(faixaEtaria);
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public String getFaixaEtaria() {
	        return faixaEtaria;
	    }

	    public void setFaixaEtaria(String faixaEtaria) {
	       
	        if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") ||
	            faixaEtaria.equals("6 a 10") || faixaEtaria.equals("acima de 10")) {
	            this.faixaEtaria = faixaEtaria;
	        } else {
	            System.out.println("Faixa etária inválida!");
	            this.faixaEtaria = null;
	        }
	    }
	    
	    public String mostrar(){
	    	return "Nome: " + this.nome + "\nPreco: " + this.preco + "\nFaixa Etaria: " + this.faixaEtaria;
	    }
	}
	

