package heranca;

public class Gerente extends Funcionario {
    public Gerente(String nome, int matricula) {
        super(nome, matricula);
    }

    public void fecharOCaixa() {
        System.out.println(getNome() + " fechou o caixa.");
    }
}
