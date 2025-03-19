public class Pets {
    private String raca;
    private String nome;
    private int idade;
    private char sexo;
    private String especie;
    private boolean castrado;

    //construtor

    public Pets(String especie, String raca, String nome, int idade, char sexo, boolean castrado){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.especie = especie;
        this.castrado = castrado;
    }

    //getters e setters

    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public boolean getCastrado(){
        return castrado;
    }
    public void setCastrado(boolean castrado){
        this.castrado = castrado;
    }


    //metodos

  

    //método tostring

    public String toString(){
        return ("Nome do pet: " + nome + "\nEspécie: " + especie + "\nRaça: " + raca + "\nIdade: " + idade + 
                                                        "\nSexo: " + sexo + "\nCastrado: " + castrado);
    }

}



