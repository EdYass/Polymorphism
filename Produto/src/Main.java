
public class Main {
    public static void main(String[] args) {
    Eletronico p1 = new Eletronico(" ",0f ,0 );
    Alimento p2 = new Alimento("Intel core i5 12400f",1031.10f,13);
    p1.coletarDados();
    p1.mostrarDados();
    p1.calcularDesconto();
        System.out.println("================================================");
    p2.mostrarDados();
    p2.calcularDesconto();
    }
}