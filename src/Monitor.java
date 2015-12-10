
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monitor {

	public static void main(String[] args){
	
	menuUm();	
		
	}

	public static void menuUm() {
	
		
		for (int i = 0; i < 10; i++) {
			Condicoes cond = new Condicoes();
			List<Numero> numeros = new ArrayList<>();
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digite um numero:");
			String valor = in.next();
			char[] charArray = valor.toCharArray();
			for (char c : charArray) {
				Numero n = cond.getNumero(String.valueOf(c));
				numeros.add(n);
				
				n.printNumero();
			}
			LimpaTela();
		}
		
	}
	
	public static void LimpaTela(){
		for (int i = 0; i < 10; i++) {
			System.out.println("\n");
		}
	}
}
