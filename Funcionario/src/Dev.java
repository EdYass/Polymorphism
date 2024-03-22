public class Dev extends Gerente{
    public Dev(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario, bonus);
    }

    @Override
    public void coletarDados() {
        super.coletarDados();
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
    }

    @Override
    public void calcularBonus() {
        super.calcularBonus();
    }
}
