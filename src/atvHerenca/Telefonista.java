package atvHerenca;

public class Telefonista extends Funcionario {
    private String codigoEstacao;

    public Telefonista(double salario, String nome, String codigoEstacao) {
        super(salario, nome);
        this.codigoEstacao = codigoEstacao;
    }

    public String getCodigoEstacao() {
        return codigoEstacao;
    }

    public void setCodigoEstacao(String codigoEstacao) {
        this.codigoEstacao = codigoEstacao;
    }
}
