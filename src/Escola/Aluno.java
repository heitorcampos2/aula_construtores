/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;

/**
 *
 * @author ifnmg
 */
public class Aluno {
    private String nome;
    private String matricula;
    //////////////////////////////////  <<<<CRIANDO UM CONSTRUTOR <<
      public Aluno(String n, String m){
          setNome(n);
          setMatricula(m);
          
            System.out.println("Construindo um aluno...");
        }
    //////////////////////////////////  <<<<CRIANDO UM CONSTRUTOR <<
    public String getNome(){
        return this.nome;
    }
    
    public String getMatricula(){
    return this.matricula;
    }
    //////////////////////////////////
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setMatricula(String m){
        this.matricula = m;
    }
    //////////////////////////////////
    
    
}
