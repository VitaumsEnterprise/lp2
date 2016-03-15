//Erstellung von Vitaum

public class TrabalhoPalindromo{
	public static int palSize = 5;
	boolean  bool=false;
	String teste="";    
	void encontraPal(String given,int vezesTest){
		for(int i=0;i<=vezesTest;i++){
      		teste = given.substring(i,i+palSize);
        	//Inverter a String(2 linhas)
        	StringBuffer txtrever = new StringBuffer(teste);
        	txtrever.reverse();
			String rever = txtrever.toString();
        if(teste.equals(rever)){
        	System.out.println("A palindrome encontrada foi: " + teste);
			System.out.println("Posição: " + (i+1) + "-" + (i+palSize));
                bool=true;
                System.exit(0);
            }
        }
        if(bool==false){
            System.out.println("Nao foi encontrada uma palindrome");
        }
	}
	public static void main(String[]args){
       		//Acionar uma String informada como Parâmetro
		 String text = args[0];
		//Size é o tamanho da palavra
   		int size = text.length();
		//Número de testes(no caso de "batata" será 2)
   		int testVezes = size - palSize;
		TrabalhoPalindromo tp = new TrabalhoPalindromo();
		tp.encontraPal(text,testVezes);    
    }
}
