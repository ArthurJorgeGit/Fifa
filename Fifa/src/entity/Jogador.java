package entity;

public class Jogador {
    private String nome;
    private String posicao;
    private int overall;

    public Jogador(String nome, String posicao, int overall) {
        this.nome = nome;
        this.posicao = posicao;
        this.overall = overall;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

}
