import com.sun.security.jgss.GSSUtil;

public class Animais implements Metodos{
    private int idade;
    private float peso;

    public Animais(int idade, float peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}

    @Override
    public void status() {
        System.out.println("Idade: "+this.idade);
        System.out.println("Peso: "+this.peso+"KG");
    }

    @Override
    public void emitirSom() {
    }

    @Override
    public void mover() {
    }
}
