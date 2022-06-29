import java.util.Scanner;

public class atividade13 {
        //13 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
    //14 - Acrescente ao exercício anterior a mensagem "Infelizmente, você foi reprovado!" caso a média calculada seja menor que 6.0.
    public static void main (String [] args){
        int nota1, nota2, nota3, nota4;
        int media;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a sua primeira nota:");
        nota1 = in.nextInt();

        System.out.println("Por favor, informe, a segunda nota: ");
        nota2 = in.nextInt();

   
        System.out.println("Por favor, informe, a terceira nota: ");
        nota3 = in.nextInt();

        System.out.println("Por favor, informe, a quarta nota: ");
        nota4 = in.nextInt();

   
        media = (nota1 + nota2 + nota3 + nota4) / 4;


        if (media >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado!, sua media foi: " + media);
        }

        else  {
            System.out.println("Infelizmente você foi reprovado, sua media foi: " + media);
        }


    }
}