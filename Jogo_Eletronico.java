// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Eletronico extends Jogo {
    private String plataforma;
    private String conectividade;
    private float avaliação;

    public Jogo_Eletronico(String nome, String marca, Float valor, int qntPlayers, String plataforma,
            String conectividade,
            float avaliação) {
        super(nome, marca, valor, qntPlayers);
        this.plataforma = plataforma;
        this.conectividade = conectividade;
        this.avaliação = avaliação;
    }

    public Jogo_Eletronico() {
        plataforma = "";
        conectividade = "";
        avaliação = 0f;
    }

    public String getConectividade() {
        return conectividade;
    }

    public void setConectividade(String conectividade) {
        this.conectividade = conectividade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(float avaliação) {
        this.avaliação = avaliação;
    }

}