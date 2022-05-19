
package rachacuca;


import java.util.Scanner;
import java.io.IOException;

public class poligono {
  public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);
      long N = leitor.nextLong();
	long L = leitor.nextLong();
	long P = N * L;
	
    
    System.out.println( P);
  }}