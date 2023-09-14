import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //--------------- Exercício 7 ---------------//

        /*
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        System.out.println("Digite seu salário:");
        double sal =  scanner.nextDouble();

        if(sal > 2000 && age >= 18){
            System.out.println("Você pode comprar um carro!");
        }else{
            System.out.println("Você não pode comprar um carro!");
        }


        //--------------- Exercício 8 ---------------//

        System.out.println("Você é Gestante, Idoso, PCD ou Nenhuma das alternativas (n)?");
        String fila = scanner.nextLine();

        if(fila.equals("Gestante") || fila.equals("gestante") || fila.equals("Idoso") || fila.equals("Idosa") || fila.equals("idoso") || fila.equals("idosa") || fila.equals("PCD") || fila.equals("pcd")) {
            System.out.println("Você tem direito a fila prioritária!");
        }else{
            System.out.println("Você NÃO tem direito a fila prioritária!!!");
        }


        //--------------- Exercício 9 ---------------//

        System.out.println("Em que ano você nasceu?");
        int ano = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        int anoatual = scanner.nextInt();

        int totalidade = anoatual - ano;

        System.out.println("Você fará "+ totalidade +" anos nesse ano.");


        //--------------- Exercício 10 ---------------//

        System.out.println("Bem-vindo ao conversor de temperatura de Celsius para Fahrenheit, digite uma temperatura em celsius:");
        int cel = scanner.nextInt();

        double far = (cel*9/5) + 32;

        System.out.println("O resultado é " + far + " F");



        //--------------- Exercício 11 ---------------//

        System.out.println("Digite uma palavra e/ou frase e contaremos as vogais");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0;

        for(int i = 0;i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vogais++;
            }
        }
        if(vogais == 1) {
            System.out.println("Existe " + vogais + " vogal na sua palavra/frase.");
        }else{
            System.out.println("Existem " + vogais + " vogais na sua palavra/frase.");
        }



        //--------------- Exercício 12 ---------------//

        System.out.println("Bem-vindo ao conversor de moeda do Pedro lindão, digite um valor em dólar e vamos converter para reais:");
        double dolar = scanner.nextDouble();

        double reais = Math.round(dolar*4.91568);
        System.out.println("Isso da R$" + reais);
        */

        //--------------- Exercício 13 ---------------//

        System.out.println("Digite um número não negativo e informaremos o fatorial:");
        int num = scanner.nextInt();

        if(num >= 0) {
            long fatorial = 1;

            for(int i = 1; i <= num; i++){
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }else{
            System.out.println("Eu falei sem número negativo seu animal.");
        }

        }
    }
