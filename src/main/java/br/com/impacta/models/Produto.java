package br.com.impacta.models;

public class Produto {
    public Integer codigo;
    public String descricao;
    public Double valor;

    public String montarResumo(Produto produto){
        return "codigo: " + produto.codigo + ", descricao: " + produto.descricao + ", valor: " + produto.valor;
    }
    
}
