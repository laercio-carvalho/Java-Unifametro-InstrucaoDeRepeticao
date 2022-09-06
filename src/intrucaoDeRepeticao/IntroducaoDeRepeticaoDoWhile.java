package intrucaoDeRepeticao;

import java.util.Scanner;

public class IntroducaoDeRepeticaoDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = -1;
        float media, notas = 0, totalNotas = 0.0f;
        //System.out.println("Digite sua nota: ");
        //notas = teclado.nextFloat();

        while (notas != -1){
            totalNotas += notas;
            System.out.println("Digite a nota nota ou -1 para sair: ");
            notas = teclado.nextFloat();
            contador++;
        }
        media = totalNotas/contador;


        //System.out.println("A media geral é: "+media);

    }
}
