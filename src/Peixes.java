//SUBCLASSE
public class Peixes extends Pets{

    //atributos são herdados automaticamente
    private boolean aguaDoce;
   

    //construtores

    public Peixes(String especie, String raca, String nome, int idade, char sexo, boolean castrado, boolean aguaDoce){
        super(especie,raca,nome,idade,sexo, castrado);
        this.aguaDoce = aguaDoce;}


    //getters e setters
        public boolean getAguaDoce(){
            return aguaDoce;
        }
        public void setAguaDoce(boolean aguaDoce){
            this.aguaDoce = aguaDoce;
        }


    //metodos sao herdados mas é possivel alterar


    
    public String toString(){
        return ("----PEIXE---\nNome do pet: " + getNome() + "\nEspécie: " + getEspecie() + "\nRaça: " + getRaca() + "\nIdade: " + getIdade() + 
                                                        "\nSexo: " + getSexo() + "\nCastrado: " + getCastrado() + "\n É de água doce: " + aguaDoce);
    }

}
