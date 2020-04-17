package cinco_e_seis;

public class TesteRestaurante extends Pedido{

//FAZER OS CONTRUTORES DA PARADA

    public TesteRestaurante(String cliente, String ultimoPedido){
        super(cliente, ultimoPedido);
        
    }

    public TesteRestaurante(String cliente, String ultimoPedido, double valorTotal){
        super(cliente, ultimoPedido, valorTotal);
        
    }

//FAZER OS METODOS DO STATUS DA PARADA

    public String statusUltimoPedido() {

        StringBuilder status = new StringBuilder();

        status.append(super.getCliente()).append(" pediu ").append(super.getUltimoPedido()).append(" no valor de: R$").append(super.getValorTotal());

        if(super.isPedidoPendente()){
            status.append("\n O pedido esta pendente! \n");
        }else{
            status.append("\n O pedido foi concluido! \n");
        }
        return status.toString();

        
    }    



}
