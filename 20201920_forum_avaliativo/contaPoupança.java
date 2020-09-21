public final class contaPoupança extends conta {
    private double beneficio =2.00;

    public contaPoupança(String nome,int numeroDaConta, int senha) { //CONSTUTOR
        this.nomeTitular = nome;
        this.numeroDaConta = numeroDaConta;
        this.senha = senha;
        this.tipoDeConta = "Conta Poupança";
	}

	@Override
    public void depositar(double valorParaDeposito){ //DEPÓSITO EM CONTA POUPANÇA - APLICAR BENEFÍCIO
        this.aplicarBeneficio();
        super.depositar(valorParaDeposito);
    }

    private void aplicarBeneficio() {
        this.saldoEmConta +=this.beneficio;
    }
    
}
