import java.util.Scanner;

public class Nota {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    float nota;
    
    do {
      System.out.println("Digite uma nota válida:");
      nota = ler.nextFloat();
      if (nota > 10 || nota < 0) {
        System.out.println("Nota inválida!");
      }
    } while (nota > 10 || nota < 0);
    System.out.println("Sua nota é " + nota);
  }
}
