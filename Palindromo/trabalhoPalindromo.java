public class TrabalhoPolíndromo{
    public static void main(String[]args) {
        String text = args[0],retorno="";
        String palSizeS = args[1];
        int palSize = Integer.parseInt(palSizeS);
        int size = text.length();
        int testVezes = size - palSize + 1;
        //Inverter a String(2 linhas)
        StringBuffer sb = new StringBuffer(text);
        sb.reverse();
    }
}
