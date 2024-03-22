import java.util.*;

public class Gerente extends Funcionario{
    public Gerente(String nome, int idade, double salario,double bonus) {
        super(nome, idade, salario,bonus);
    }

    @Override
    public void coletarDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do funcionário: ");
        this.setNome(teclado.nextLine());
        System.out.printf("Digite a idade do funcionário: ");
        super.setIdade(teclado.nextInt());
        System.out.printf("Digite o salário do funcionário: ");
        super.setSalario(teclado.nextDouble());
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+super.getIdade());
        System.out.println("Salário: "+super.getSalario());
    }

    @Override
    public void calcularBonus() {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o bônus recebido(em procentagem): ");
        this.setBonus(teclado.nextDouble());
        double novoS = super.getSalario()*(1+(this.getBonus()/100));
        System.out.println("Novo salário com acrescimo de "+this.getBonus()+"%: "+novoS);
    }
}
