package entities;

import java.util.ArrayList;

public class Cachorro extends Animal{
    private String cor;
    private double peso;
    private String raca;

    public Cachorro(String cor, double peso, String raca, String nome, String idade) {
        super(nome, idade);
        this.cor = cor;
        this.peso = peso;
        this.raca = raca;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void CadastrarAnimal(String nome, String idade) {
        super.CadastrarAnimal(nome, idade); 
        Cachorro novoCachorro = new Cachorro(cor, peso, raca, nome, idade);
        Animal.listaDeAnimais.add(novoCachorro);
    }
    
//    public void editarAnimal(String nomeBusca, String novoNome, String novaIdade, String novaCor, double novoPeso, String novaRaca){
//        for(Cachorro c : Animal.listaDeAnimais){
//            if(c.getNome().equals(nomeBusca)){
//                c.setNome(novoNome);
//                c.setIdade(novaIdade);
//                c.setCor(novaCor);
//                c.setPeso(novoPeso);
//                c.setRaca(novaRaca);
//                System.out.println("Cachorro editado: " + c.getNome() + ", Cor: " + c.getCor());
//            }
//        }
//    }
    
    @Override
    public void listarAnimal(){
        System.out.println("Lista de cachorros: ");
        for(Cachorro c : Animal.listadeCachorros){
            System.out.println("Nome: "+ c.getNome()+ " idade: "+ c.getIdade());
        }
    }
    
    @Override
    public void concluirAdocao(){
        if(listadeCachorros.remove(this)){
            System.out.println("Adoção concluída para o cachorro: "+ this.getNome());
        } else {
            System.out.println("Cachorro não encontrado");
        }
    }
    
}
