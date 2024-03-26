public class Main {
    public static void main(String[] args) {
        Gerente f1 = new Gerente("", 0, 0, 0);
        f1.coletarDados();
        System.out.println("-------------------------------------------------");
        f1.mostrarDados();
        System.out.println("-------------------------------------------------");
        f1.calcularBonus();
        System.out.println("=================================================");

     /*Dev f2 = new Dev("",0,0,0);
     f2.coletarDados();
        System.out.println("-------------------------------------------------");
     f2.mostrarDados();
        System.out.println("-------------------------------------------------");
     f2.calcularBonus();
    */
    }
}