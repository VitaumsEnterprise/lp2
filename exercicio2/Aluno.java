public class Aluno{
    String nome, matricula;
    int idade;
    public void ImprimirDados(){
        System.out.println ("Nome: " + this.nome);
        System.out.println ("Idade: " + this.idade);
        System.out.println ("Numero Matricula: " + this.matricula);
    }
    public static void main (String [] args){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Fulano";
        aluno1.matricula = "0001";
        aluno1.idade = 17;
        aluno1.ImprimirDados();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ciclano";
        aluno2.matricula = "0002";
        aluno2.idade = 17;
        aluno2.ImprimirDados();

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Beltrano";
        aluno3.matricula = "0003";
        aluno3.idade = 17;
        aluno3.ImprimirDados();

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Herbert";
        aluno4.matricula = "0004";
        aluno4.idade = 17;
        aluno4.ImprimirDados();
    }
}
