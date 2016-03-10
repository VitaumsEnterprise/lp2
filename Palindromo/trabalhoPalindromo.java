//Erstellung von Vitaum

public class TrabalhoPalindromo{
    public static void main(String[]args){
        boolean  bool=false;
        //Acionar uma String informada como Parâmetro
        String text = args[0],teste="";
        int palSize = 5;
        //Size é o tamanho da palavra
        int size = text.length();
        //Número de testes(no caso de "batata" será 2)
        int testVezes = size - palSize;
        for(int i=0;i<=testVezes;i++){
            teste = text.substring(i,i+palSize);
            //Inverter a String(2 linhas)
            StringBuffer txtrever = new StringBuffer(teste);
            txtrever.reverse();
            if(txtrever.equals(teste)){
                System.out.println("A palindrome encontrada foi: " + teste);
                bool=true;
            }
        }
        if(bool==false){
            System.out.println("Nao foi encontrada uma palindrome");
        }
    }
}
