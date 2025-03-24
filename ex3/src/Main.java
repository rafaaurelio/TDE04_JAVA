public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Rafael", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Jamal", 2000);

        gerente.exibirDados();
        System.out.println("Bônus: R$" + gerente.calcularBonus());

        System.out.println();

        desenvolvedor.exibirDados();
        System.out.println("Bônus: R$" + desenvolvedor.calcularBonus());
    }
}