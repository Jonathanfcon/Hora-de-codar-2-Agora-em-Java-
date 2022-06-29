import java.util.Scanner;
        
public class atividade10 {
    //10. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiro;
        double segundo;
        double terceiro;
        double quarto;
        
        System.out.print("Digite a primeira nota: ");
        primeiro = input.nextInt();

        System.out.print("Digite a segunda nota: ");
        segundo = input.nextInt();

        System.out.print("Digite a terceira nota: ");
        terceiro = input.nextInt();

        System.out.print("Digite a quarta nota: ");
        quarto = input.nextInt();


        if (primeiro > 0 && segundo  > 0 && terceiro  > 0 && quarto > 0 && primeiro <= 10  && segundo <= 10  && terceiro <= 10  && quarto <= 10 ) {

            double média  = ( primeiro + segundo + terceiro + quarto ) / 4;

            System.out.println(" Você passou no teste! ");

        }
        else {
            System.out.println("Tente novamente.");
        }
        
    }
}