import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class QualquerCoisa {

	private int valor;

	public QualquerCoisa(int valor) {
		this.valor = valor;
	}

	public int GetValor() {
		return (this.valor);
	}

	public void SetValor(QualquerCoisa x, int valor) {
		x.valor = valor;
	}

	public static boolean isOdd(int i) {
		int val = i & 0x7F;
		return val % 2 == 1;
	}
}

public class Test {

	public static void main(String[] args) {
		QualquerCoisa aAnyThing, bAnyThing;
		aAnyThing = new QualquerCoisa(10);
		bAnyThing = new QualquerCoisa(5);
		System.out.println(aAnyThing.GetValor());
		aAnyThing.SetValor(aAnyThing, 0);
		System.out.println(aAnyThing.GetValor());
		aAnyThing.SetValor(bAnyThing, 10);
		System.out.println(bAnyThing.GetValor());

		/*String the same object if both are equals.*/  
		String a = "abcd";
		String b = "abcd";

		if (b == a) {
			System.out.println("Sim");
		}

		System.out.println(isOdd(-6));
		System.out.println(isAnagram("aaaa", "aaaa"));
		troco();
		
		Multiplexador mux = new Multiplexador(4,5,7,21);
		mux.aciona(2); //exit equals 5
		System.out.println("O valor saida é: "+mux.getSaida());

		try{
			int x  = 15;
			double y = x / 0;
			System.out.println("A divisão é " + y);
		}catch(ArithmeticException e){
			System.out.println("Erro!! Divisão por zero!!!");
		}

		Complica comp = new Complica(25);
		for (int i=5; i<=50; i++)
		{
			if (i<comp.limear) {
				comp.incrementa1();
			}
			else{
				comp.incrementa2();
			}
			if (i==(i=comp.limear))
				comp.zera();
		}
		System.out.print("O valor de saída é: "+comp.ValorFinal());
	}

	public static boolean isOdd(int i) {
		return (i & 0x01) == 1;
	}
	
	public static boolean isAnagram(String leftString, String rightString) {
		
		if (leftString == null || rightString == null) {
		    return false;
		  } else if (leftString.length() != rightString.length()) {
		    return false;
		  }

		  Map<Character, Integer> occurrencesMap = new HashMap<>();

		  for(int i = 0; i < leftString.length(); i++) {
		    char charFromLeft = leftString.charAt(i);
		    
		    int nrOfCharsInLeft = occurrencesMap.containsKey(charFromLeft) ? occurrencesMap.get(charFromLeft) : 0;
		    occurrencesMap.put(charFromLeft, ++nrOfCharsInLeft);
		    
		    char charFromRight = rightString.charAt(i);
		    int nrOfCharsInRight = occurrencesMap.containsKey(charFromRight) ? occurrencesMap.get(charFromRight) : 0;
		    occurrencesMap.put(charFromRight, --nrOfCharsInRight);
		  }

		  for (int occurrencesNr : occurrencesMap.values()) {
		    if(occurrencesNr != 0) {
		      return false;
		    }
		  }

		  return true;
		}
	
	public static void troco() {
		System.out.println((float)2.0 - (float)1.10);
	 }

}

class Multiplexador {
	private int Entrada1;
	private int Entrada2;
	private int Entrada3;
	private int Entrada4;
	public int Saida;
	
	public Multiplexador (int Valor1,int Valor2, int Valor3, int Valor4 )
	{
		this.Entrada1 = Valor1;
		this.Entrada2 = Valor2;
		this.Entrada3 = Valor3;
		this.Entrada4 = Valor4;
	}
	
	public void aciona (int escolha)
	{
		switch (escolha) {
		case 1 : 
			Saida = Entrada1;
			break;
		case 2 : 
			Saida = Entrada2;
			break;
		case 3 : 
			Saida = Entrada3;
			break;
		case 4 : 
			Saida = Entrada4;
			break;

		default : Saida = Entrada1;
		}
	}
	
	public int getSaida ()
	{
		return Saida;
	}
}

class Complica {
	private int confundi1,confundi2;
	public int limear;
	
	public void incrementa1(){
		confundi2+=1;
	}
	
	public void incrementa2(){
		confundi1+=1;
	}
	
	public void zera(){
		confundi1=0;
		confundi2=0;
	}
	
	public Complica (int entrada){
		limear = entrada;
	}
	
	public int ValorFinal (){
		return confundi1+(2*confundi2);
	}
}
