public class Cachorro extends Animais{
    private String raca;

    public Cachorro(String raca, int idade, float peso) {
        super(idade, peso);
        this.raca=raca;
    }

    public String getRaca() {return raca;}
    public void setRaca(String raca) {this.raca = raca;}

    @Override
    public void status() {
        System.out.println("Animal: Cachorro");
        System.out.println("Raça: "+this.raca);
        super.status();
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro "+this.raca+" está latindo");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro "+this.raca+" está correndo");
    }
}
