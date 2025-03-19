//SUBCLASSE
public class Mamiferos extends Pets{

    //atributos são herdados automaticamente
    
   

    //construtores

    public Mamiferos(String especie, String raca, String nome, int idade, char sexo, boolean castrado){
        super(especie,raca,nome,idade,sexo, castrado);
    }


    //getters e setters



    //metodos sao herdados mas é possivel alterar

    public String toString(){
        return ("----MAMÍFERO---\nNome do pet: " + getNome() + "\nEspécie: " + getEspecie() + "\nRaça: " + getRaca() + "\nIdade: " + getIdade() + 
                                                        "\nSexo: " + getSexo() + "\nCastrado: " + getCastrado());
    }


}