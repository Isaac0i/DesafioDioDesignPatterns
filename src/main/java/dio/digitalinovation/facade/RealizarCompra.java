package dio.digitalinovation.facade;

import dio.digitalinovation.service.EmitirNf;
import dio.digitalinovation.service.EnviarEmail;
import dio.digitalinovation.service.ProcessarPagamento;
import dio.digitalinovation.service.VerificarEstoque;

public class RealizarCompra {
    private EmitirNf nf;
    private EnviarEmail email;
    private ProcessarPagamento pagamento;
    private VerificarEstoque estoque;


    public RealizarCompra(){
        this.nf = new EmitirNf();
        this.email = new EnviarEmail();
        this.pagamento = new ProcessarPagamento();
        this.estoque = new VerificarEstoque();
    }

    public void finalizarCompra(){

        if(!estoque.verificar()){
            System.out.println("Estoque insuficiente!");
            return;
        }

        if(!pagamento.processar()){
            System.out.println("Pagamento recusado!");
            return;
        }

        nf.emitir();
        email.enviar();

        System.out.println("Compra finalizada!");
    }

}
