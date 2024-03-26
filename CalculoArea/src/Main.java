public class Main {
    public static void main(String[] args) {
    Circulo c1 = new Circulo(5);
    Retangulo r1 = new Retangulo(2,5);
    Triangulo t1 = new Triangulo(4,3);

    c1.calcularArea();
    c1.calcularPerimetro();
        System.out.println("==========================");
    r1.calcularArea();
    r1.calcularPerimetro();
        System.out.println("==========================");
    t1.calcularArea();
    t1.calcularPerimetro();
    }
}