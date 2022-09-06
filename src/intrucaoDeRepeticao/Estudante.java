package intrucaoDeRepeticao;

public class Estudante {
    //Variaveis de instancia

    private String nome;
    private float media;

    //construtor
    public Estudante(String nome,float media) {
        if (media > 0.0 && media <= 10)
            this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        if (media > 0.0 && media <= 10)
        this.media = media;
    }
}
