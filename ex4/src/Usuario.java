public class Usuario {
    private String nome;
    private String email;
    public String senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        getSenha(senha);
    }

    public void getSenha(String senha){
        if (senha.length() >= 6){
            System.out.println("Sua senha precisa ter pelo menos 6 caracteres");
            this.senha = senha;
        }else {
            System.out.println("Sua senha precisa ter pelo menos 6 caracteres");
        }
    }
    public void exibirUsuario(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

    }

}
