
import entities.Animal;
import entities.Cachorro;
import entities.Gato;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato novoGato = new Gato("Perola", 2, 6, "Branco");
        Cachorro novoCachorro = new Cachorro("Princesa", 20, 80, "NEGONA");
        Animal novoAnimal = new Cachorro("ANIMAL", 1, 2, "CINZA");
        
        
        novoGato.emitirSom();
        novoCachorro.emitirSom();
        novoAnimal.emitirSom();
        
    }
    
}
