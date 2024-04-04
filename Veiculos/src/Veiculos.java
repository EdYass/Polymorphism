public class Veiculos implements Metodos{
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int ano;
    protected int veiculo;

    public Veiculos(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }


    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public int getVeiculo() {return veiculo;}
    public void setVeiculo(int veiculo) {this.veiculo = veiculo;}


    @Override
    public void apresentarDados() {
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ano: "+this.ano);
    }

    @Override
    public void acelerar(){System.out.println("O carro "+this.modelo+" está acelerando.");}
    @Override
    public void acelerar(int veiculo) {
        if (veiculo == 1){
            System.out.println("O carro "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 200km/h");
        }else if(veiculo == 2){
            System.out.println("A moto "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 140km/h");
        }else if(veiculo == 3){
            System.out.println("O caminhão "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 90km/h");
        }else{
            System.out.println("Código inválido ou o veículo está desligado.");
        }

    }
    public void acelerar(int veiculo, boolean bebado) {
        if ((veiculo == 1)&&(!bebado)){
            System.out.println("O carro "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 200km/h");
            System.out.println("Não aconteceu nenhum acidente");
        }else if ((veiculo == 1)&&(bebado)){
            System.out.println("O carro "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 320km/h");
            System.out.println("O motorista está bêbado");
            System.out.println("Aconteceu um acidente");
        }else if((veiculo == 2)&&(!bebado)){
            System.out.println("A moto "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 140km/h");
        }else if ((veiculo == 2)&&(bebado)){
            System.out.println("O carro "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 280km/h");
            System.out.println("O motorista está bêbado");
            System.out.println("Aconteceu um acidente");
        }else if((veiculo == 3)&&(!bebado)){
            System.out.println("O caminhão "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 90km/h");
        }else if ((veiculo == 3)&&(bebado)){
            System.out.println("O caminhão "+this.modelo+" está acelerando.");
            System.out.println("Velociade atual: 150km/h");
            System.out.println("O motorista está bêbado");
            System.out.println("Aconteceu um acidente");
        }else{
            System.out.println("Código inválido ou o veículo está desligado.");
        }
    }
}
