public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + nome + " Idade: " + idade + " anos");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    public void emitirSom(){
        System.out.println(nome + " Está latindo: Au Au!");
    }
}

class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    public void emitirSom(){
        System.out.println(nome + " Está miando: Miau!");
    }
}
