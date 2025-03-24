public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Cleitin", "cleitin@gmail.com", "123456");
        Usuario usuario2 = new Usuario("Jão", "jaozinpvp@gmail.com", "12345");

        usuario.exibirUsuario();
        System.out.println();
        usuario2.exibirUsuario();
    }

}