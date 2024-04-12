package exemplointerface;

public class FuncionarioMensalista implements Operacoes {

    String nome;
    double salario;
    
    public FuncionarioMensalista (String nome, double salario){ //método construtor
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularSalarioLiquido() {
        
        return this.salario - this.salario * 27.5 / 100;
    }

    
}
