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
        
        System.out.println("Entre com o sal�rio brutodo mensalista: ");
        salarioAux = sc.nextDouble();
        
        FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux, salarioAux);
        
        sc.nextLine();
        
        System.out.println("\nInforme o nome do funcion�rio diarista: ");
        nomeAux = sc.nextLine();
        
        System.out.println("Qual o valor da hora do funcion�rio diarista: ");
        salarioAux = sc.nextDouble();
        
        System.out.println("Quantos dias ele trabalhou? ");
        diasAux = sc.nextInt();
        
        FuncionarioDiarista fD = new FuncionarioDiarista (nomeAux, salarioAux, diasAux);
        
        System.out.println("\n\t\t - Dados e sal�rio do funcion�rio Mensalista - ");
        System.out.println("\tNome: " + fM.nome);
        System.out.println("\tSal�rio Bruto: " + fM.calcularSalarioLiquido());
       
        
        System.out.println("\n\t\t - Dados e sal�rio do funcion�rio Diarista - ");
        System.out.println("\tNome: " + fD.nome);
        System.out.println("\tSal�rio Bruto: " + fD.calcularSalarioLiquido());
                      
    }
    
}
