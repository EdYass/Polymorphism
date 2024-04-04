import java.util.*;

public class Eletronico extends Produto{

    public Eletronico(String nome, float preco, double desconto) {
        super(nome, preco, desconto);
    }

    @Override
    public void coletarDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do eletrônico: ");
        this.setNome(teclado.nextLine());
        System.out.printf("Digite o preço do eletrônico: ");
        super.setPreco(teclado.nextFloat());
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Preço: "+super.getPreco());
    }

    @Override
    public void calcularDesconto() {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o desconto recebido(em procentagem): ");
        this.setDesconto(teclado.nextDouble());
        double novoP = (super.getPreco()*(1-(this.getDesconto()/100)));
        System.out.println("Novo preço com o desconto de "+this.getDesconto()+"%%: "+novoP);
    }
}