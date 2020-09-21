import javax.swing.JOptionPane;

public class AppConta {
    public static void main(String[] args) {      

        //contaCorrente usuarioX = new contaCorrente(nome, numeroDaConta, senha);

        contaPoupança usuarioY = new contaPoupança("josé Eduardo", 102030, 12345);

        contaCompartilhada con1 = new contaCompartilhada("jose", "Ana", 102030, 123456);

        con1.setCpfContaCompartilhada("104.208.719-93", "581.395.249-72");
        System.out.println("Dados cadastrais "+ con1.getCadastroCliente());

        //System.out.println("Dados cadastrais "+ usuarioX.getCadastroCliente());

        System.out.println("Dados cadastrais "+ usuarioY.getCadastroCliente());

        usuarioY.depositar(1000);
        usuarioY.getSaldo(12345);
        usuarioY.realizarTransferencia(1000, 200, "Pagamento de dividas");
        usuarioY.getSaldo(12345);

    }
}

