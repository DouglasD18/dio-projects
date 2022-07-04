import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    System.out.println("Digite um número inteiro positivo: ");
    int num = ler.nextInt();
    
    int resultado = 1;
  
    for (int i = num; i > 0; i--) {
      resultado *= i;
    }
  
    System.out.println("O fatorial do número que você digitou é: " + resultado);
  }
}
