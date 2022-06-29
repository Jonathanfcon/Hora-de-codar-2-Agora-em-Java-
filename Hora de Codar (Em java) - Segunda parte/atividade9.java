import java.util.Scanner;
        
public class atividade9 {
    //9. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiro;
        int segundo;
        int terceiro;
        int quarto;
        int quinto;
        int sexto;
        
        System.out.print("Digite 6 valores inteiros (Os valores não podem ser maiores que 72) \n");
        System.out.print("Digite o primeiro número inteiro: ");
        primeiro = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        segundo = input.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        terceiro = input.nextInt();

        System.out.print("Digite o quarto número inteiro: ");
        quarto = input.nextInt();

        System.out.print("Digite o quinto número inteiro: ");
        quinto = input.nextInt();

        System.out.print("Digite o sexto número inteiro: ");
        sexto = input.nextInt();

        if ( primeiro < 72 && segundo < 72 && terceiro < 72 && quarto < 72 && quinto < 72 && sexto < 72 ) {
            int resultado  = primeiro + segundo + terceiro + quarto + quinto + sexto;

            System.out.println("Os números selecionados foram " + primeiro + ", " + segundo + ", " + terceiro + ", " + quarto + ", " + quinto + ", " + sexto +  
        ". A soma desses valores é " + resultado);

        }
        else {
            System.out.println("Operação negada. Todos valores informados tem que ser menor que 72.");
        }
        
    }
}