package entities;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal{

    
    public Gato(String nome, int idade, double peso, String cor ) {
        super(nome, idade, peso, cor, "GATO");
    }

    @Override
    public void cacadastrarAnimal() {
        super.cacadastrarAnimal(); 
    }

    @Override
    public void cadastrarAnimal(String nome, int idade, double peso, String cor, String especie) {
        super.cadastrarAnimal(nome, idade, peso, cor, especie); 
    }

    @Override
    public void emitirSom() {
//        super.emitirSom(); 
        System.out.println("MIADO");
    }
    
    
    

    

    
    
    
    
    
}
