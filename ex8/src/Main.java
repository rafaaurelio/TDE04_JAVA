public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Scooby", 5);
        Gato gato = new Gato("Sol",2);

        cachorro.emitirSom();
        gato.emitirSom();
        System.out.println();
        cachorro.exibirInfo();
        gato.exibirInfo();
    }
}