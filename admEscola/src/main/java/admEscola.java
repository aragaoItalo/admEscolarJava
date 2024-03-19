/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class admEscola {
    // Atributos estáticos
    private static int totalAlunos = 0;
    private static int totalProfessores = 0;

    // Atributos de instância
    private String nome;
    private int idade;

    // Construtor para Alunos e Professores.
    public admEscola (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        totalAlunos++;
    }

    public admEscola(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        totalProfessores++;
    }

    // Método estático para obter o total de alunos e professores.
    public static int getTotalAlunos() {
        return totalAlunos;
    }

    public static int getTotalProfessores() {
        return totalProfessores;
    }

    // Método para exibir as informações.
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String args []) {
        // Instâncias de alunos e professores.
        admEscola aluno1 = new admEscola("João", 15);
        admEscola aluno2 = new admEscola("Maria", 16);
        admEscola professor1 = new admEscola("Wagner", 45, "Professor");
        admEscola professor2 = new admEscola("Maria", 40, "Professora");

        // Exibindo as informações e utilizando \n para quebra de linha.
        System.out.println("Alunos:");
        aluno1.exibirInfo();
        aluno2.exibirInfo();
        System.out.println("\nProfessores:");
        professor1.exibirInfo();
        professor2.exibirInfo();

        // Exibindo o total dos alunos e professores.
        System.out.println("\nTotal de alunos: " + admEscola.getTotalAlunos());
        System.out.println("Total de professores: " + admEscola.getTotalProfessores());
    }
}
