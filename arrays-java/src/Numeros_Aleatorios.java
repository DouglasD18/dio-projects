import java.util.Random;

public class Numeros_Aleatorios {
  public static void main(String[] args) {
    Random random = new Random();
    
    int[] numeros_aleatorios = new int[8];
  
    for (int i = 0; i < numeros_aleatorios.length; i++) {
      numeros_aleatorios[i] = random.nextInt(100);
      System.out.print(numeros_aleatorios[i] + " ");
    }
  
    System.out.println(" ");
  
    for (int numero : numeros_aleatorios) {
      System.out.print(numero + 1 + " ");
    }
  }
}
