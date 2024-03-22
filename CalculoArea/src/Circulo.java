public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio){
        this.raio=raio;
    }

    public double getRaio(){return this.raio;}
    public void setRaio(double raio){this.raio=raio;}


    @Override
    public double calcularArea() {
        System.out.println("A área do círculo é: " + Math.PI * raio * raio);
        return 0;
    }
    @Override
    public double calcularPerimetro() {
        System.out.println("O perímetro do círculo é: "+2*Math.PI*raio);
        return 0;
    }
}
