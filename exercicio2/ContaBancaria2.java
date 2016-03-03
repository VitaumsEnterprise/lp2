public class ContaBancaria2{
    int agencia;
    int contaCorrente;
    float saldo;
    float limiteExtra;
    String titularConta;
    public void imprimirSaldo(){
        System.out.println("O saldo da conta E: " + saldo);
    }
    public void imprimirSaldoTotal(){
    }
    public void imprimirAgencia(){
        System.out.println("A agencia e: " + agencia);
    }
    public void imprimirContaCorrente(){
        System.out.println("A conta-corrente e: " + contaCorrente);
    }
    public void imprimirTitular(){
        System.out.println("O titular da conta e: " + titularConta);
    }
    public static void main(String[]args){
        ContaBancaria2 obj1 = new ContaBancaria2();
        ContaBancaria2 obj2 = new ContaBancaria2();
        float s1,s2;
        /*Declara valores às variáveis do objeto obj1*/
        obj1.agencia = 3610;
        obj1.contaCorrente = 15766;
        obj1.saldo = 35.34;
        obj1.limiteExtra = 50.00;
        obj1.titularConta = "Fulano";
        /*Declara valores às variáveis do objeto obj2*/
        obj2.agencia = 810;
        obj2.contaCorrente = 6132;
        obj2.saldo = 42.31;
        obj2.limiteExtra = 75;
        obj2.titularConta = "Ciclano";
        /*Chama os métodos para o obj1*/
        obj1.imprimirAgencia();
        obj1.imprimirContaCorrente();
        obj1.imprimirSaldo();
        obj1.imprimirTitular();
        s1 = obj1.saldo + obj1.limiteExtra;
        s2 = obj2.saldo + obj2.limiteExtra;
        System.out.println(" ");
        System.out.println(obj1.titularConta + " " + obj1.agencia + " " + obj1.contaCorrente + " " + obj1.saldo + " " + s1);
        System.out.println(" ");
        /*Chama os métodos para o obj2*/
        obj2.imprimirAgencia();
        obj2.imprimirContaCorrente();
        obj2.imprimirSaldo();
        obj2.imprimirTitular();
        System.out.println(" ");
        System.out.println(obj2.titularConta + " " + obj2.agencia + " " + obj2.contaCorrente + " " + obj2.saldo + " " + s2);
        System.out.println(" ");
    }
