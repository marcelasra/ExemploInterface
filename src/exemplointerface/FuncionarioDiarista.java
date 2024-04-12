package exemplointerface;

public class FuncionarioDiarista implements Operacoes {

    String nome;
    double valorHora;
    int diasTrabalhados;
    
    public FuncionarioDiarista (String nome, double valorHora, int diasTrabalhados){ //método construtor
        this.nome = nome;
        this.valorHora = valorHora;
        this.diasTrabalhados = diasTrabalhados;
    }
    
    @Override
    public double calcularSalarioLiquido() {
        
        return (8 * valorHora) * diasTrabalhados;
    }
    
}
