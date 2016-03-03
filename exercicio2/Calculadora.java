public class Calculadora{
    int a, b;
    void soma(){
        System.out.println("A soma dos dois valores e: " + (a+b));
    }
    void subtracao(){
        System.out.println("A subtracao dos dois valores e: " + (a-b));
    }
    void multiplicacao(){
        System.out.println("A multiplicacao dos dois valores e: " + (a*b));
    }
    void divisao(){
        System.out.println("A divisao dos dois valores e: " + (a/b));
    }

    public static void main(String[]args){
        Calculadora a1 = new Calculadora();
        a1.a=25;
        a1.b=5;
        a1.soma();
        a1.subtracao();
        a1.multiplicacao();
        a1.divisao();

        Calculadora a2 = new Calculadora();
        a2.a=30;
        a2.b=3;
        a2.soma();
        a2.subtracao();
        a2.multiplicacao();
        a2.divisao();

        Calculadora a3 = new Calculadora();
        a3.a=1000;
        a3.b=10;
        a3.soma();
        a3.subtracao();
        a3.multiplicacao();
        a3.divisao();
    }
}
