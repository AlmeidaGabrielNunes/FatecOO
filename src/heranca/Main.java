package heranca;
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 12345);
        Vendedor vendedor = new Vendedor("Maria", 54321);
        Faxineiro faxineiro = new Faxineiro("Carlos", 67890);

        gerente.baterOPonto();
        gerente.fecharOCaixa();

        vendedor.baterOPonto();
        vendedor.realizarVenda();

        faxineiro.baterOPonto();
        faxineiro.solicitarMaterial();
    }
}