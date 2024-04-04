import java.util.*;
public class Moto extends Veiculos{
    private int cilindrada;

    public Moto(String marca, String modelo, String cor, int ano, int cilindrada) {
        super(marca, modelo, cor, ano);
        this.cilindrada=cilindrada;
    }

    public int getCilindrada() {return cilindrada;}
    public void setCilindrada(int cilindrada) {this.cilindrada = cilindrada;}

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Cilindradas: "+cilindrada+"cc");
    }

}
