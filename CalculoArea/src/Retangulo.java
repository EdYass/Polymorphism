public class Retangulo extends Forma{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura=largura;
        this.altura = altura;
    }

    public double getLargura() {return largura;}
    public void setLargura(double largura) {this.largura = largura;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    @Override
    public double calcularArea() {
        System.out.println("A área do retângulo é: "+largura*altura);
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("O perímetro do retângulo é: "+2*(largura*altura));
        return 0;
    }
}
