import java.util.Scanner;

public class atividade15 {
        //15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
    public static void main (String[] args){
        int ano;
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, informe o ano de seu nascimento:");
        ano = in.nextInt();

        
        if (ano <= 2006) {
            System.out.println("Voce ja pode votar em 2022");
        }
        
        else {
            System.out.println("Infelizmente você ainda não pode votar em 2022");
        }

    }
}