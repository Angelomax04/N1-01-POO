package src.ex07;

public class Empregado {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean ativo;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = Math.max(0, salario); }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public void excluir() {
        nome = null;
        cpf = null;
        cargo = null;
        salario = 0;
        ativo = false;
    }

    @Override
    public String toString() {
        return "Empregado{nome=" + getNome() + ", cpf=" + getCpf() + ", cargo=" + getCargo() + ", salario=" + getSalario() + ", ativo=" + isAtivo() + "}";
    }
}
