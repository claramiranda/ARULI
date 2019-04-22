package br.unicamp.ft.c155041_g157918;

public class Republicas {
    private String nome;
    private int level_agitação;
    private String bio;
    private int vagas_temporarias;
    private int foto;

    /**
     * TODO Criar list view pra exibir as infos das reps
     * @param nome - nome da república
     * @param level_agitação - de 1 a 5 bananas, o nível de zoeira da rep
     * @param bio - pequena descrição
     * @param vagas_temporarias
     * @param vagas_permanetes
     * @param foto - logo da rep (usar por enquanto o banner da aruli)
     */


    //Constructor
    public Republicas(String nome, int level_agitação, String bio, int vagas_temporarias, int vagas_permanetes, int foto) {
        this.nome = nome;
        this.level_agitação = level_agitação;
        this.bio = bio;
        this.vagas_temporarias = vagas_temporarias;
        this.vagas_permanetes = vagas_permanetes;
        this.foto = foto;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel_agitação() {
        return level_agitação;
    }

    public void setLevel_agitação(int level_agitação) {
        this.level_agitação = level_agitação;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getVagas_temporarias() {
        return vagas_temporarias;
    }

    public void setVagas_temporarias(int vagas_temporarias) {
        this.vagas_temporarias = vagas_temporarias;
    }

    public int getVagas_permanetes() {
        return vagas_permanetes;
    }

    public void setVagas_permanetes(int vagas_permanetes) {
        this.vagas_permanetes = vagas_permanetes;
    }

    private int vagas_permanetes;


}
