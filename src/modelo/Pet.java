package modelo;

public class Pet {

    private String nome;
    private int idade;
    private String especie;
    private int id;
    private static int valor=1;

    public Pet(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.id = valor++;
    }

    public Pet() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pet:" +"\n"+
                "nome=" + nome + "\n" +
                "idade=" + idade + "\n"+
                "especie=" + especie + "\n" +
                "id=" + id;
    }
}
