public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria("Jair", 150.00);
        ContaBancaria contaBancaria2 = new ContaBancaria("Clóvis", 500.00);

        contaBancaria.exibirSaldo();
        contaBancaria.Depositar(150.00);
        contaBancaria.exibirSaldo();
        System.out.println();
        contaBancaria.Sacar(200);
        contaBancaria.exibirSaldo();
        System.out.println();
        contaBancaria.Transferir(contaBancaria2, 100.00);
        contaBancaria.exibirSaldo();

        System.out.println();
        contaBancaria2.exibirSaldo();
        contaBancaria2.Depositar(200.00);
        contaBancaria2.exibirSaldo();
        System.out.println();
        contaBancaria2.Sacar(250.00);
        contaBancaria2.exibirSaldo();
    }

}