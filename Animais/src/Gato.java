public class Gato extends Animais{
    private String corPelo;
    public Gato(String corPelo, int idade, float peso) {
        super(idade, peso);
        this.corPelo=corPelo;
    }

    public String getCorPelo() {return corPelo;}
    public void setCorPelo(String corPelo) {this.corPelo = corPelo;}

    @Override
    public void status() {
        System.out.println("Animal: Gato");
        System.out.println("Cor do pelo: "+this.corPelo);
        super.status();
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato "+this.corPelo+" está miando");
    }

    @Override
    public void mover() {
        System.out.println("O gato "+this.corPelo+" está andando sobre o muro");
    }
}
