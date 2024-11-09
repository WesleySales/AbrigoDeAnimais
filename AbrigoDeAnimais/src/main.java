
import entities.Adocao;
import entities.Animal;
import entities.Cachorro;
import entities.Gato;
import entities.Tutor;

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
        
        
        Tutor.cadastrarTutor("Joao", "Silva", "12345", 20);
        Tutor.cadastrarTutor("Yngred", "Silva", "12345", 20);
        
        
        Adocao.registrarAdocao(Tutor.listaDeTutores.get(0), novoGato);
        Adocao.registrarAdocao(Tutor.listaDeTutores.get(0), novoCachorro);
//        Adocao.registrarAdocao(Tutor.listaDeTutores.get(0), novoCachorro);
        Adocao.registrarAdocao(Tutor.listaDeTutores.get(1), novoAnimal);
        
        System.out.println(Adocao.listaDeAdocoes.get(0));
        System.out.println(Adocao.listaDeAdocoes.get(1));
        System.out.println(Adocao.listaDeAdocoes.get(2));
    }
    
}
