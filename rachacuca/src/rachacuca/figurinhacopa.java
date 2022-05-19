package rachacuca;


 /*package rachacuca;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class figurinhascopa {
    public static void main(String[] args) {
    


    Scanner scan = new Scanner(System.in);
    int numTotal = scan.nextInt();
    int numFigCompradas = scan.nextInt();
    Set<Integer> setFig = new HashSet<>();
//TODO: Complete os espaços em branco com uma solução possível para o problema
    

    System.out.println(numTotal - setFig.size());
  }
}
ou assim */  
 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class figurinhacopa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		
		int total = list.stream().distinct().collect(Collectors.toList()).size();
		System.out.println(n - total);
	}
	
}	