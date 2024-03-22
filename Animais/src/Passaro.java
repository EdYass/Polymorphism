public class Passaro extends Animais{
    private String corPena;
    public Passaro(String corPena, int idade, float peso) {
        super(idade, peso);
        this.corPena=corPena;
    }

    @Override
    public void status() {
        System.out.println("Animal: Passaro");
        System.out.println("Cor da pena: "+this.corPena);
        super.status();
    }

    @Override
    public void emitirSom() {
        System.out.println("O passaro "+this.corPena+" está piando");
    }

    @Override
    public void mover() {
        System.out.println("O passaro "+this.corPena+" está voando");
    }
}
