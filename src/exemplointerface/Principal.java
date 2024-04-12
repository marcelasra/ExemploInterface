package exemplointerface;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nomeAux;
        double salarioAux;
        int diasAux;
        
        System.out.println("Informe o nome do funcionario mensalista: ");
        nomeAux = sc.nextLine();
        
        System.out.println("Entre com o salário brutodo mensalista: ");
        salarioAux = sc.nextDouble();
        
        FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux, salarioAux);
        
        sc.nextLine();
        
        System.out.println("\nInforme o nome do funcionário diarista: ");
        nomeAux = sc.nextLine();
        
        System.out.println("Qual o valor da hora do funcionário diarista: ");
        salarioAux = sc.nextDouble();
        
        System.out.println("Quantos dias ele trabalhou? ");
        diasAux = sc.nextInt();
        
        FuncionarioDiarista fD = new FuncionarioDiarista (nomeAux, salarioAux, diasAux);
        
        System.out.println("\n\t\t - Dados e salário do funcionário Mensalista - ");
        System.out.println("\tNome: " + fM.nome);
        System.out.println("\tSalário Bruto: " + fM.calcularSalarioLiquido());
       
        
        System.out.println("\n\t\t - Dados e salário do funcionário Diarista - ");
        System.out.println("\tNome: " + fD.nome);
        System.out.println("\tSalário Bruto: " + fD.calcularSalarioLiquido());
                      
    }
    
}
