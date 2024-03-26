public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Border Collie",10,20f);
        Gato g1 = new Gato("preto",5,4f);
        Passaro p1 = new Passaro("amarelo", 2, 1f);
        c1.status();
        c1.emitirSom();
        c1.mover();
            System.out.println("====================================");
        g1.status();
        g1.emitirSom();
        g1.mover();
            System.out.println("====================================");
        p1.status();
        p1.emitirSom();
        p1.mover();
    }
}