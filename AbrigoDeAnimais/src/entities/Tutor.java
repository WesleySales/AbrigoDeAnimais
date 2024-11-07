package entities;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
   private static int geradorID=1;
   private int id; 
   private String nome;
   private String sobrenome;
   private String telefone;
   private int idade;
   private boolean ativo;
   
   private static List<Tutor> listaDeTutores = new ArrayList<>();

    public Tutor( String nome, String sobrenome, String telefone, int idade) {
        this.id = geradorID++;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.idade = idade;
        this.ativo = true;
    }
   
    public static void cadastrarTutor( String nome, String sobrenome, String telefone, int idade){
        Tutor tutor = new Tutor(nome, sobrenome, telefone, idade);
        listaDeTutores.add(tutor);
    }
    
    public static void arquivarTutor(int id){
        Tutor t = buscarTutorPorId(id);
        t.setAtivo(false);
    }
    
    public static Tutor buscarTutorPorId(int id){
        if(!listaDeTutores.isEmpty()){
            for(Tutor t: listaDeTutores){
                if(t.getId()==id && t.isAtivo()==true){
                    return t;
                }
            }
        }
        return null;
    }
    
    public static Tutor buscarTutorPorNome(String nome){
        if(!listaDeTutores.isEmpty()){
            for(Tutor t: listaDeTutores){
                if(t.getNome().equalsIgnoreCase(nome) && t.isAtivo()==true){
                    return t;
                }
            }
        }
        return null;
    }

    public static String exibirTutores(){
        StringBuilder sb = new StringBuilder();
        if(!listaDeTutores.isEmpty()){
           for(Tutor t: listaDeTutores){
               
               if(t.isAtivo()==true){
                  sb.append(t).append("\n"); 
               }
           }
        }
        return sb.toString();
    }
    
    public static int getGeradorID() {
        return geradorID;
    }

    public static void setGeradorID(int geradorID) {
        Tutor.geradorID = geradorID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
   
    @Override
    public String toString() {
        return "id:" + getId() + ", Tutor: " + getNome() + " " + getSobrenome() + 
                ", Telefone=" + getTelefone() + ", Idade: " + getIdade();
    }
    
}
