package tiposprimitivos;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Você digitou: " + idade);
        
        System.out.println("Digite o tamanho do seu terreno: ");
        double largura = scan.nextDouble();
        
        System.out.println("Você digitou: " + largura);

        scan.close();

    }
    
}