package intrucaoDeRepeticao;

public class InstrucaoDeRepeticao {
    public static void main(String[] args) {
        float totalnotas;
        int contador = 0;


        Estudante aluno = new Estudante("Laercio",8.9f);

        aluno.setNome("Pedro");
        aluno.setMedia(7.8f);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());
    }
}
