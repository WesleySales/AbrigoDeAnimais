package entities;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal{
    private String cor;
    private String raca;
    private double peso;
    
    private static List<Gato> listaDeGatos = new ArrayList<>();

    public Gato(String nome, String idade, String cor, String raca, double peso) {
        super(nome, idade);
        setId(Animal.geradorIdAnimal++);
        this.cor = cor;
        this.raca = raca;
        this.peso = peso;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void cadastrarAnimal(String nome, String idade, String cor, String raca, double peso) {
        Gato novoGato = new Gato(nome, idade, cor, raca, peso);
        listaDeGatos.add(novoGato);
        Animal.listaDeAnimais.add(novoGato);
    }
//
//    public void editarAnimal(String nomeBusca, String novoNome, String novaIdade, String novaRaca, String novaCor, double novoPeso) {
//        for (Gato g : li) {
//            if (g.getNome().equals(nomeBusca)) {
//                g.setNome(novoNome);
//                g.setIdade(novaIdade);
//                g.setRaca(novaRaca);
//                g.setCor(novaCor);
//                g.setPeso(novoPeso);
//                System.out.println("Gato editado: " + g.getNome());
//            }
//        }
//
//    }

//    @Override
//    public void listarAnimal() {
//        System.out.println("Lista de gatos: ");
//        for (Gato g : listadeGatos) {
//            System.out.println("Gato: " + g.getNome() + "Idade: " + g.getIdade());
//        }
//    }

//    @Override
//    public void concluirAdocao() {
//        if (listadeGatos.remove(this)) {
//            System.out.println("Adoção concluída para o gato: " + this.getNome());
//        } else {
//            System.out.println("Gato não encontrado");
//        }
//    }
}
