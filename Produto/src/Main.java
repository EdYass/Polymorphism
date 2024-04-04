
public class Main {
    public static void main(String[] args) {
    Eletronico p1 = new Eletronico(" ",0f ,0 );
    Alimento p2 = new Alimento("Batata",40.0f,2);
    p1.coletarDados();
    p1.mostrarDados();
    p1.calcularDesconto();
        System.out.println("================================================");
    p2.mostrarDados();
    p2.calcularDesconto();
    }
}