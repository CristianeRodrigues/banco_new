/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_new;

/**
 *
 * @author Cristiane
 */
public class Cliente {
    String nome;
    int ag;
    Conta cc;

     public String getNome() {
        return this.nome;
    }

     public void setAg() {
         this.ag = cc.getAgencia();
        System.out.println("Agencia");
    }
    public void setAg2() {
         cc.agencia = 5456;
}
