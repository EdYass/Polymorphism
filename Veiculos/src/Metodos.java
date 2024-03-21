public interface Metodos {
    public abstract void apresentarDados();

    public default void acelerar() {
    }

    void acelerar(int veiculo);
    public abstract void acelerar(int veiculo, boolean bebado);
}
