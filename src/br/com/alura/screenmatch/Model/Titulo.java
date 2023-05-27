package br.com.alura.screenmatch.Model;

public class Titulo {
    private String nome;
    private int anoDeLacamento;

    private boolean incluidoNoPlano;

    private double avaliacao;
    private int totalDeAvaliacoes;

    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLacamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLacamento = anoDeLacamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoDeLacamento);
        System.out.println("Duracao: " + duracaoEmMinutos);
        System.out.println("Incluido no plano :" + incluidoNoPlano);
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public double arredonda() {
        return  Math.round(pegaMedia());
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLacamento() {
        return anoDeLacamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
