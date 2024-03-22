public class Triangulo extends Forma{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base=base;
        this.altura = altura;
    }

    public double getBase() {return base;}
    public void setBase(double base) {this.base = base;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    @Override
    public double calcularArea() {
        System.out.println("A área do triângulo é: "+(base*altura)/2);
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa;
        double areaT;
        hipotenusa = Math.sqrt((base*base) + (altura*altura));
        areaT = base+altura+hipotenusa;
        System.out.println("O perímetro do triângulo é: "+areaT);
        return 0;
    }
}
