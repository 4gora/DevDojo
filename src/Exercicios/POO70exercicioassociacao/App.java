package Exercicios.POO70exercicioassociacao;

public class App {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Alessandro", 21);
        Aluno aluno2 = new Aluno("Vinicius", 21);
        Aluno aluno3 = new Aluno("Victória", 20);
        Aluno aluno4 = new Aluno("André", 20);


        Professor professor = new Professor("Roberto","Análise combinatória");

        Seminario seminario1 = new Seminario("Trabalhando com dados muito específicos e interessantes", new Local("São Thomé das Letras"), new Aluno[]{aluno1, aluno2, aluno3});
        Seminario seminario2 = new Seminario("Análise de Sistemas de Análise de Relatórios de Combinação de Dados de Relatórios Científicos", new Local("São Gabriel do Oeste"), new Aluno[]{aluno1, aluno3});

        Seminario seminario3 = new Seminario("Direito espacial", new Local("Curitiba"), new Aluno[]{});


        professor.setSeminarios(new Seminario[]{seminario1, seminario2});

        System.out.println(professor);
        System.out.println(seminario1);
        System.out.println(seminario3);
    }
}
