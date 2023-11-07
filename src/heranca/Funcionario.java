package heranca;

public class Funcionario {
    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void baterOPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    public void solicitarMaterial() {
        System.out.println(nome + " solicitou material.");
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}
