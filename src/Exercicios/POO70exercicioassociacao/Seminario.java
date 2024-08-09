package Exercicios.POO70exercicioassociacao;

import java.util.Arrays;

public class Seminario {
    private String titulo;

    private Local local;

    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INFORMAÇÕES DO SEMINÁRIO:\n");
        sb.append("\nTítulo = ").append(titulo);
        sb.append("\nLocal = ").append(local.getEndereco());

        if (alunos.length < 1) {
            sb.append("\nNão há alunos no seminário.");
        } else {

            sb.append("\nAlunos:\n");
            for (Aluno aluno : alunos) {
                sb.append(aluno.getNome()).append("\n");
            }
        }

        return sb.toString();
    }
}
