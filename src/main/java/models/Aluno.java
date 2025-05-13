package models;

public class Aluno {

    private Integer matricula;
    private String ano;
    private Integer idade;
    private String nome;

    public Aluno(String ano, Integer idade, Integer matricula, String nome) {
        this.ano = ano;
        this.idade = idade;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", ano='" + ano + '\'' +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
