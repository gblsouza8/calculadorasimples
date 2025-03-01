package calculadorasimples;
import java.util.Scanner;
public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {


        // Declaração das variaveis que serão usadas ao longo do programa
        int escolha = 0;
        int num1, num2, soma, subtracao, multiplicao, divisao;
        // Inicio do loop que se repetirá enquanto o usuário não escolher a opção 5 (sair)
        while (escolha != 5){
            // Abertura do Scanner 
            Scanner in = new Scanner(System.in);
            // Perguntando qual operação o usuário deseja realizar
            System.out.println("Qual operação você deseja realizar?\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Sair ");
            
            // Declarando a opção do usuário com a variável escolha
            escolha = in.nextInt();

            // Abrindo a lista de casos dependendo da escolha do usuário
            switch(escolha){
                case 1 -> {

                    // Pergunta ao usuário e armazena os números que serão usados no cálculo nas variáveis num1 e num 2 
                    System.out.println("Digite o primeiro número: ");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = in.nextInt();
                    // Realiza a operação e exibe o resultado
                    soma = num1+num2;
                    System.out.println("O resultado da soma entre " + num1 + " e " + num2 + " é: " + soma);
                }

                case 2 -> {
                    // Pergunta ao usuário e armazena os números que serão usados no cálculo nas variáveis num1 e num 2 
                    System.out.println("Digite o primeiro número: ");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = in.nextInt();
                    // Realiza a operação e exibe o resultado
                    subtracao = num1-num2;
                    System.out.println(num1 + " menos " + num2 + " é: " + subtracao);
                }

                case 3 -> {
                    // Pergunta ao usuário e armazena os números que serão usados no cálculo nas variáveis num1 e num 2 
                    System.out.println("Digite o primeiro número: ");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = in.nextInt();
                    // Realiza a operação e exibe o resultado
                    multiplicao = num1*num2;
                    System.out.println(+ num1 + " multiplicado por " + num2 + " é: " + multiplicao);
                }

                case 4 -> {
                    // Pergunta ao usuário e armazena os números que serão usados no cálculo nas variáveis num1 e num 2 
                    System.out.println("Digite o primeiro número: ");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número: ");
                    num2 = in.nextInt();
                    // Realiza a operação e exibe o resultado
                    divisao = num1/num2;
                    System.out.println("O resultado da divisão de " + num1 + " por " + num2 + " é: " + divisao);
                }

                
                case 5 -> System.out.println("Programa finalizado.");

                default -> System.out.println("Escolha não reconhecida.");
            }
        }
    }
}