
package rachacuca;

import java.util.Scanner;

public class degustacaovinho {
    public static void main(String[] args) {

 
  Scanner scan = new Scanner(System.in);

  String T = scan.nextLine();

  String respostasCompetidores = scan.nextLine();

  int respostasCertas = 0;

  String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");



//TODO: Complete o código com uma possível solução para o problema.   

 for ( int i = 0; i < respostasCompetidoresSplit.length; i++ ) {

  
   if ( T.equals(respostasCompetidoresSplit[i]) ) {

    respostasCertas++;

    

   } 

  }

   

  System.out.println( respostasCertas );

 }

}

    
 

