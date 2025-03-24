class Motor{
    private boolean ligado;

    public Motor(){
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }
    public boolean isLigado(){
        return ligado;
    }
}

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo){
        this.modelo = modelo;
        this.motor = new Motor();
    }

    public void ligar(){
        motor.ligar();
        if (motor.isLigado()){
            System.out.println("O carro " + modelo + " está ligado!");
        }else {
            System.out.println("O carro " + modelo + "não conseguiu ligar!" );
        }
    }
}
