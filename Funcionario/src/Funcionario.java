public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private double bonus;

    public Funcionario(String nome, int idade, double salario,double bonus) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.bonus=bonus;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    public double getBonus() {return bonus;}
    public void setBonus(double bonus) {this.bonus = bonus;}

    public abstract void coletarDados();

    public abstract void mostrarDados();
    public void calcularBonus(){

    }
}
