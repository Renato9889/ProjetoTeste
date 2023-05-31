import animal.Gato;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Gato[][] matrix = new Gato[2][2];
        for (int i=0 ; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                Gato gatox = Principal.lerDados();
                matrix[i][j] = gatox;
            }
        }
        Principal.imprimir(matrix);
    }

    public static void imprimir(Gato [][] matrix){
        for (int i=0 ; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print("|");
                System.out.print("["+"Nome: " + matrix[i][j].nome+"]");
                System.out.print("["+"Raça: " + matrix[i][j].raca+"]");
                System.out.print("["+"Idade em meses: " + matrix[i][j].idade+"]");
                System.out.print("["+"Peso: " + matrix[i][j].peso+"]");
                System.out.print("["+"É bravo?" + matrix[i][j].isBravo+"]");
                System.out.print("|");
            }
            System.out.println();
        }
    }
    public static Gato lerDados(){
        Scanner ler = new Scanner(System.in);
        Gato gatox = new Gato();

        System.out.println("Informe o nome do Gato: ");
        gatox.nome = ler.next();

        System.out.println("Informe a Raça do gato: ");
        gatox.raca = ler.next();

        System.out.println("Informe a idade em meses do gato: ");
        gatox.idade = ler.nextInt();

        System.out.println("Informe o peso em kg do gato: ");
        gatox.peso = ler.nextFloat();

        boolean dadocerto = false;
        while(!dadocerto){
            System.out.println("O gato é Bravo? \n[1]Sim  \n[2]Não  \nDigite sua resposta:");
            int escolha = ler.nextInt();
            if(escolha == 1){
                gatox.isBravo = true;
                dadocerto = true;
            }else{
                if(escolha == 2) {
                    gatox.isBravo = false;
                    dadocerto = true;
                }
            }
        }
        return gatox;
    }
}