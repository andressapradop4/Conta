/*A entrada consiste de uma única linha que 
contém dois inteiros H e P (1 ≤ H, P ≤ 1000) indicando 
       respectivamente o número total de coxinhas consumidas e 
               o número total de participantes na competição.
    */
package rachacuca;

import java.util.Scanner;
public class Coxinha_De_Bueno_Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();


    String[] inputSplit = input.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    double media = Double.parseDouble( inputSplit[0]
            )/Double.parseDouble(inputSplit[1] );


    System.out.printf("%.2f",media);
  }
}
