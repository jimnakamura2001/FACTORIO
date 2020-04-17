package cinco_e_seis;

import java.util.Random;

public class Pedido {

//ATRIBUTOS MUITO FODAS

	private String cliente;
	private String ultimoPedido;
	private boolean pedidoPendente = true;
	private double valorTotal; 

//CONTRUTORES QUE DAO AS CARACTERISTICAS NECESSARIAS PRA PORA SER A PORA

	Pedido(String cliente, String ultimoPedido){		
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;

	}

	Pedido(String cliente, String ultimoPedido,double valorTotal){
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
		this.valorTotal = valorTotal;
	}

//METODOS DA PARADA QUE VAO DAR OS POWERS NECESDSARIOS

	public void fazPedido() {
		this.calculaPedido();

	}

	public void entregaPedido() {
		this.pedidoPendente = false;
	}

	public void calculaPedido() {

		Random valorBruto = new Random();
		double valorFinal = valorBruto.nextInt(30);
		this.valorTotal = valorFinal + 1.0;		
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getUltimoPedido() {
		return ultimoPedido;
	}

	public void setUltimoPedido(String ultimoPedido) {
		this.ultimoPedido = ultimoPedido;
	}

	public boolean isPedidoPendente() {
		return pedidoPendente;
	}

	public void setPedidoPendente(boolean pedidoPendente) {
		this.pedidoPendente = pedidoPendente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}


