import java.util.Scanner;

public class Ordem_Inversa {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int[] array = new int[5];
  
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite um número inteiro: ");
      array[i] = ler.nextInt();
    }
  
    System.out.println("O seu array em ordem inversa é: ");
    for (int i = 4; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
  }
}
