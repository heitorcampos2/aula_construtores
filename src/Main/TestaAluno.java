/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Escola.Aluno;
/**
 *
 * @author ifnmg
 */
public class TestaAluno {
    public static void main(String[] args){
        
        Aluno a1 = new Aluno("Larissa","007");
        //a1.setNome("Larissa");
        //a1.setMatricula("007");
        
        System.out.println("Nome: "+a1.getNome());
        System.out.println("Matricula: "+a1.getMatricula());
        
      
        
    }
}
