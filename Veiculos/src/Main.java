public class Main {
    public static void main(String[] args) {
     Carro c1 = new Carro("Fiat","Uno","Prata",1997);
     Carro c2 = new Carro("Toyota", "Corolla","Preta", 2021);
     Moto m1 = new Moto("Kawazaki","Ninja ZX-6R","Preta e Verde", 2023,636);
     Caminhao C1 = new Caminhao("Scania","770 S","Prata",2023,true);
     c1.apresentarDados();

     c1.acelerar(1,false);
        System.out.println("==================================================");
     c2.apresentarDados();
        System.out.println("==================================================");
     c2.acelerar();
        System.out.println("==================================================");
     m1.apresentarDados();
        System.out.println("==================================================");
     m1.acelerar(2);
        System.out.println("==================================================");
     C1.apresentarDados();
        System.out.println("==================================================");
     C1.acelerar(3,true);
    }
}