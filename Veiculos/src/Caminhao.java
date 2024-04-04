public class Caminhao extends Veiculos{
    private boolean carreta;

    public Caminhao(String marca, String modelo, String cor, int ano, boolean carreta) {
        super(marca, modelo, cor, ano);
        this.carreta=carreta;
    }

    public boolean isCarreta() {return carreta;}
    public void setCarreta(boolean carreta) {this.carreta = carreta;}

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        if(this.carreta){
            System.out.println("É um carreta, um caminhão articulado.");
        }else{
            System.out.println("É um caminhão monobloco");
        }
    }

}
