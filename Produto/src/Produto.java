public abstract class Produto {
    private String nome;
    private float preco;
    private double desconto;

    public Produto(String nome, float preco, double desconto) {
        this.nome = nome;
        this.preco= preco;
        this.desconto=desconto;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public float getPreco() {return preco;}
    public void setPreco(float preco) {this.preco = preco;}

    public double getDesconto() {return desconto;}
    public void setDesconto(double deconto) {this.desconto = deconto;}

    public abstract void coletarDados();

    public abstract void mostrarDados();
    public void calcularDesconto(){

    }
}