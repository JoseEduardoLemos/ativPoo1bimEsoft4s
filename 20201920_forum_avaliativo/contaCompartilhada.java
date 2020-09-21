import java.util.ArrayList;

public class contaCompartilhada extends conta {

    private String nomeDaParte1, nomeDaParte2, cpfPessoa1, cpfPessoa2;

    public contaCompartilhada(String nomeDaParte1, String nomeDaParte2, int numeroDaConta, int senha) { // CONSTUTOR
        
        this.nomeDaParte1 = nomeDaParte1;
        this.nomeDaParte2 = nomeDaParte2;
        this.numeroDaConta = numeroDaConta;
        this.senha = senha;
        this.tipoDeConta = "Conta Compartilhada";
    }

    public void setCpfContaCompartilhada(String cpfPessoa1, String cpfPessoa2) {
        this.cpfPessoa1 = cpfPessoa1;
        this.cpfPessoa2 = cpfPessoa2;
    }


   @Override
   public ArrayList<String> getCadastroCliente(){
    ArrayList<String> dadosCadastrais = new ArrayList<String>();
    String numeroConta = Integer.toString(numeroDaConta);
    dadosCadastrais.add(this.nomeDaParte1);
    dadosCadastrais.add(this.cpfPessoa1);

    dadosCadastrais.add(this.nomeDaParte2);
    dadosCadastrais.add(this.cpfPessoa2);

    dadosCadastrais.add(numeroConta);
    dadosCadastrais.add(this.tipoDeConta);

    return dadosCadastrais; 
}

    
    
    
}
