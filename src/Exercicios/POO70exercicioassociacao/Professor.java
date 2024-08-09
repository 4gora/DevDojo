package Exercicios.POO70exercicioassociacao;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INFORMAÇÕES DO PROFESSOR:\n");
        sb.append("\nNome = ").append(nome);
        sb.append("\nEspecialidade = ").append(especialidade);
        sb.append("\nSeminários:\n");
        for (Seminario seminario : seminarios) {
            sb.append(seminario.getTitulo()).append("\n");
        }

        return sb.toString();
    }
}
