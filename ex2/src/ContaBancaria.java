public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double Saldo){
        this.titular = titular;
        this.saldo = Saldo;
    }

    public String getTitular(){
        return titular;
    }
    public double getSaldo(double Saldo){
        return saldo;
    }

    public void Depositar(Double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Foi realizado um depósito de: R$" + valor);
        }else{
            System.out.println("Não foi possível realizar o depósito");
        }
    }

    public void Sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Foi realizado um saque de: R$" + valor);
        }else{
            System.out.println("Você não possui saldo suficiente");
        }

    }

    public void Transferir(ContaBancaria destino, double valor){
        if(saldo >= valor){
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Foi realizado uma transferência de: R$" + valor + " para " + destino.titular);
        }else{
            System.out.println("Não foi possível realizar a transfêrencia, saldo insuficiente");
        }
    }


    public void exibirSaldo(){
        System.out.println("Olá! " + titular + " Seu saldo atual é: R$"  + saldo);


    }
}

