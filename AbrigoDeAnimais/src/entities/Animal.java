package entities;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected static int geradorIdAnimal = 100;
    protected int id;
    protected String nome;
    protected int idade;
    protected double peso;
    protected String cor;
    protected String especie;

    public static List<Animal> listaDeAnimais = new ArrayList<>();

    public Animal(String nome, int idade, double peso, String cor, String especie) {
        this.id = geradorIdAnimal++;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.especie = especie;
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
    
    public void emitirSom(){
        System.out.println("Fazendo barulho");
    }

    public void cadastrarAnimal(String nome, int idade, double peso, String cor, String especie) {
        Animal novoAnimal = new Animal(nome, idade, peso, cor, especie);
        listaDeAnimais.add(novoAnimal);
    }
    
    public void cacadastrarAnimal(){
        listaDeAnimais.add(this);
    }

    public void editarAnimal() {
        System.out.println("Animal editado");
    }

    public static String listarAnimais() {
        if (!listaDeAnimais.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Animal a : Animal.listaDeAnimais) {
                sb.append(a).append("\n");
            }
            return sb.toString();
        }
        return null;
    }

    public void concluirAdocao() {
        System.out.println("Adoção concluída!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
