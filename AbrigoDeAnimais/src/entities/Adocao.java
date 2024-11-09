
package entities;

import java.util.ArrayList;
import java.util.List;


public class Adocao {
    private static int geradorIdAdocao = 50;
    private int id;
    private Tutor tutor;
    private Animal animal;
    
    public static List<Adocao> listaDeAdocoes = new ArrayList<>();
    
    public Adocao (Tutor tutor, Animal animal){
        this.id = geradorIdAdocao++;
        this.tutor = tutor;
        this.animal=animal;
    }
    
    public static void registrarAdocao(Tutor tutor, Animal animal){
        Adocao adocao = new Adocao(tutor, animal);
        listaDeAdocoes.add(adocao);
        animal.setDisponivel(false);
    }

    @Override
    public String toString() {
        return "id=" + id + ", tutor =" + tutor.getNome() + ", animal=" + animal.getNome() + '}';
    }
    
    
}
