import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

public abstract class conta {
    protected double saldoEmConta = 0;
    protected String nomeTitular;
    protected int numeroDaConta;
    protected int senha;
    protected String tipoDeConta = null;
    private double custoTransferencia = 6.00;
       
        protected ArrayList<String> getCadastroCliente(){
        ArrayList<String> dadosCadastrais = new ArrayList<String>();
        String numeroDaConta = Integer.toString(this.numeroDaConta);
        dadosCadastrais.add(nomeTitular);
        dadosCadastrais.add(numeroDaConta);
        dadosCadastrais.add(tipoDeConta);
    
        return dadosCadastrais; 
    }

    protected void getSaldo(int senha){
        if(senha == this.senha){
            System.out.println("\nTITULAR: "+this.nomeTitular +
            "\nNÚMERO DA CONTA: "+ this.numeroDaConta +
            "\nSALDO EM CONTA: "+this.saldoEmConta);
        }
        else{
            throw new RuntimeErrorException(null, "Senha incorreta");
        }
    }

    public void depositar(double valorParaDeposito){
        this.saldoEmConta +=valorParaDeposito;
        System.out.println("Deposito efetuado no valor de "+valorParaDeposito);
    }

    protected void sacar(double valorParaSaque, int senha){
        if(senha == this.senha){
            if(this.saldoEmConta >= valorParaSaque){
                this.saldoEmConta -= valorParaSaque;
                System.out.println("Saque realizado no valor de "+valorParaSaque);
            }
            else{
                throw new RuntimeErrorException(null, "Saldo em conta insuficiente para o saque de "+valorParaSaque+".");
            }
        }
        else{
            throw new RuntimeErrorException(null, "Senha incorreta");
        }
    }

    public void realizarTransferencia(int contaBancaria, int valorDaTransferencia, String identificaçãoNoExtrato){
        String senhaEmText = Integer.toString(this.senha);
        String senhaDigitada = JOptionPane.showInputDialog("Digite sua senha: ");
        if(senhaDigitada.equals(senhaEmText)){
            if(this.saldoEmConta >= valorDaTransferencia + this.custoTransferencia){
                this.saldoEmConta -= valorDaTransferencia + this.custoTransferencia;
                System.out.println("Transferência concluída com sucesso!");

            }
            else{
                throw new RuntimeErrorException(null,"Saldo insuficiente");
            }
        }
        else{
            throw new RuntimeErrorException(null, "Senha incorreta");
        }
    }





}
