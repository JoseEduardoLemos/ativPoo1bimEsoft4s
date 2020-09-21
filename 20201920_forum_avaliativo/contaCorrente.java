import javax.management.RuntimeErrorException;

public final class contaCorrente extends conta {
    
    private double jurosDeSaque = 2.00;
    
    public contaCorrente(String nome,int numeroDaConta, int senha) {//CONSTRUTOR
        this.nomeTitular = nome;
        this.numeroDaConta = numeroDaConta;
        this.senha = senha;
        this.tipoDeConta = "Conta Corrente";
	}
    @Override
    public void sacar(double valorParaSaque, int senha){ //SAQUE EM CONTA CORRENTE - APLICAR JUROS
        if(senha == this.senha){
            if(this.saldoEmConta >= valorParaSaque + jurosDeSaque){
                this.cobrarJuros();
                super.sacar(valorParaSaque, senha);
            }
            else{
                throw new RuntimeErrorException(null, "Saldo em conta insuficiente para o saque de "+valorParaSaque+".");
            }
        }
        else{
            throw new RuntimeErrorException(null, "Senha incorreta");
        }
    }

    private void cobrarJuros(){
        this.saldoEmConta -= this.jurosDeSaque;
    }
}
