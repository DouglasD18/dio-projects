import java.util.Scanner;

public class Nome_Idade {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    String nome;
    int idade;
    boolean condicao = true;
    
    while (condicao) {
      System.out.println("Digite seu nome: ");
      nome = ler.next();
      if (nome.equals("0")) condicao = false;
      System.out.println("Digite sua idade: ");
      idade = ler.nextInt();
  
      System.out.println("Olá, " + nome + " de " + idade + " anos.");
    }
  }
}
