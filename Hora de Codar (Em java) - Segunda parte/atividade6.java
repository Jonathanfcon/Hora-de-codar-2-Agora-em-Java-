import java.util.Scanner;
        
public class atividade6 {
    //6.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiro;
        int segundo;
        int terceiro;
        int quarto;
        int quinto;
        int sexto;
        int setimo;
        int oitavo;
        int nono;
        int decimo;
        
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

        System.out.print("Digite o sétimo número inteiro: ");
        setimo = input.nextInt();

        System.out.print("Digite o oitavo número inteiro: ");
        oitavo = input.nextInt();

        System.out.print("Digite o nono número inteiro: ");
        nono = input.nextInt();

        System.out.print("Digite o décimo número inteiro: ");
        decimo = input.nextInt();

        int resultado  = (primeiro + segundo + terceiro + quarto + quinto + sexto + setimo + oitavo + nono + decimo) / 10;
        
        System.out.println("Os números selecionados foram " + primeiro + ", " + segundo + ", " + terceiro + ", " + quarto + ", " + quinto + ", " + sexto + ", " + setimo + ", " + oitavo + ", " + nono + ", " + decimo +  
        ". A média aritmética desses valores é " + resultado);
        
    }
}