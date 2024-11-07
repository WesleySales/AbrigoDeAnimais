package entities;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    protected static int geradorIdAnimal=100;
    protected int id;
    protected String nome;
    protected String idade;
    
    protected static List<Animal> listaDeAnimais = new ArrayList<>();
    
    public Animal(String nome, String idade){
        this.id = geradorIdAnimal++;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public void CadastrarAnimal(String nome, String idade){
        Animal novoAnimal = new Animal(nome, idade);
        listaDeAnimais.add(novoAnimal);
    }
    
    
    
    public void editarAnimal(){
        System.out.println("Animal editado");
    }
    
    public void listarAnimal(){
        System.out.println("Listando animal");
    }
    
    public void concluirAdocao(){
        System.out.println("Adoção concluída!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
}
