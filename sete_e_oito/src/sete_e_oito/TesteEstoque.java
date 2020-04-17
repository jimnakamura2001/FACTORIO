package sete_e_oito;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import sete_e_oito.Produto;

public class TesteEstoque {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner nimput = new Scanner(System.in);

		
		System.out.println("Ola! Gostaria de atuar em que Area? \n"
		+ "\n 1-> Para Produtos. "
		+ "\n 2-> Para sair. ");

		boolean produtoOuVenda = input.nextLine().equals("1");
		if(produtoOuVenda){
			System.out.println(" Voce esta na area de Produtos gostaria de fazer o que? "
			+ "\n 1 -> Para adicionar um produto ao estoque. ");

			int escolha = nimput.nextInt();

			if(escolha == 1){

				System.out.println("Digite o nome do produto que quer adicionar: ");
				String nome = input.nextLine();

				System.out.println("Digite a quantidade do produto que sera adicionada ao estoque(limite maximo de 1000 produtos): ");
				int quantidade = nimput.nextInt();

				int quantidadeMinima = 1;
				int quantidadeMaxima = 1001;

				System.out.println("Digite o preco que este produto vai ser vendido: ");
				double valor = nimput.nextDouble();

				Produto produto = new Produto(nome, quantidade, quantidadeMinima, quantidadeMaxima, valor);
				
				produto.adicionar( quantidade);

				if(produto.conferir(quantidade)){

					System.out.println(" Existem " + produto.getQuantidadeAtual() + " " + produto.getDescricao() + " no valor de R$" + produto.getPrecoVenda() + " cada um(a). \n");
				}else{
					System.out.println("Quantidade ultrapassa os limites do seu estoque (maximo 1000), tente com uma quantidade menor. \n");
				}
				
				System.out.println("O que gostaria de fazer agora? "
				+ "\n 1 -> Para vender um produto do estoque."
				+ "\n 2 -> Para adicionar outro produto");
				
				int numeroEscolhido = nimput.nextInt();

				if(numeroEscolhido == 1){

					System.out.println(" Escreva a quantidade que deseja vender: ");
					quantidade = nimput.nextInt();

					Venda venda = new Venda(produto, quantidade, valor);
					
					venda.vender(quantidade);
					
					valor = valor*quantidade;
					System.out.println(" Foi realizado uma venda de " + quantidade + " no valor de R$" + valor + " no total."
							+ "\n Sobraram " + produto.getQuantidadeAtual() + " no estoque.");

				}
				if(numeroEscolhido == 2){

					System.out.println("Digite o nome do produto que voce quer adicionar: \n");
					String novonome = input.nextLine();

					System.out.println("Digite a quantidade do produto que sera adicionada ao estoque(limite maximo de 1000 produtos): ");
					int novoquantidade = nimput.nextInt();

					System.out.println("Digite o preco que este produto sera vendido: ");
					double novovalor = nimput.nextDouble();

					produto.setDescricao(novonome);
					produto.setQuantidadeAtual(novoquantidade);
					produto.setPrecoVenda(novovalor);

					produto.adicionar(novoquantidade);

					if(produto.conferir(novoquantidade)){
						System.out.println(" Existem " + produto.getQuantidadeAtual() + " " + produto.getDescricao() + " no valor de R$" + produto.getPrecoVenda() + " cada um(a). \n");
				}else{
					System.out.println("Quantidade ultrapassa os limites do seu estoque (maximo 1000), tente com uma quantidade menor. \n");
				}
					}
				}
					  
		
			}
		
	}

}
