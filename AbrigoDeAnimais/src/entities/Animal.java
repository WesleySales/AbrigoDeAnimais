package entities;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected static int geradorIdAnimal = 100;
    protected int id;
    protected String nome;
    protected int idade;

    public static List<Animal> listaDeAnimais = new ArrayList<>();

    public Animal(String nome, int idade) {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrarAnimal(String nome, int idade) {
        Animal novoAnimal = new Animal(nome, idade);
        listaDeAnimais.add(novoAnimal);
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
