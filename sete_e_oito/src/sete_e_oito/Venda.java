package sete_e_oito;


public class Venda {
	
	Produto produto;
	private int quantidade;
	private double valorVenda;
	
	//CONSTRUTORES

	Venda (Produto produto, int quantidade, double valorVenda){
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
		
	}

	//METODOS

	public void vender(int quantidade){

		
		this.produto.setQuantidadeAtual(produto.getQuantidadeAtual() - this.quantidade);

	}

	


}
