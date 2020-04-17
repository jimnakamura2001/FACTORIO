package cinco_e_seis;

import java.util.Scanner;

import cinco_e_seis.TesteRestaurante;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner nimput = new Scanner(System.in);

//Fazer o cliente colocar as paradas dele para subastitutir no RESTAURAS WOW


		System.out.println("Insira o nome do cliente! ");
		String cliente = input.nextLine();

		System.out.println("Insira o nome do prato! ");
		String prato = input.nextLine();

		System.out.println("Pedido Concluido! :D \n");

		TesteRestaurante restaurante = new TesteRestaurante(cliente, prato);
		restaurante.fazPedido();

		boolean continuar = true;

		while(continuar){

			System.out.println(" \n O que deseja fazer? "
			+ " 1 -> Para consultar o seu pedido.\n"
			+ " 2 -> Para concluir o seu pedido. \n"
			+ " 3 -> Para fechar a aplicacao. \n");

			int escolha = nimput.nextInt();

			switch(escolha){

				case 1: 
				System.out.println(restaurante.statusUltimoPedido());

				case 2:
				restaurante.entregaPedido();

				System.out.println("Deseja fazer um novo pedido? ");
				boolean yesno = input.nextLine().equals("sim");

				if(yesno){
					System.out.println("Insira o nome do cliente: ");
					cliente = input.nextLine();

					System.out.println("Insira o nome do prato: ");
					prato = input.nextLine();

					restaurante.setCliente(cliente);
					restaurante.setPedidoPendente(true);
					restaurante.setUltimoPedido(prato);

					System.out.println("Pedido realizado com sucesso!");
					
				}else{
					break;
				}
				break;
							
				case 3:
					System.out.println("Deseja mesmo sair?"
					+ "\n sim/nao");
					boolean desejo = input.nextLine().equals("sim");

					if(desejo == false){
						break;
					}
					
			}
		}
		
	}

}
