/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Principal {
    public static void main(String[] args) {
        Cavaleiro c1 = new Cavaleiro ("Seiya", "Pegasus");
        Cavaleiro c2 = new Cavaleiro ("Mu", "Aries");
                
        while (c1.getVida() >= 0 && c2.getVida()>=0){
            Random r = new Random ();
            float valor = r.nextFloat();
            //Seya aplica o golpe
            if (valor < 0.5){
                r = new Random ();
                valor = r.nextFloat();
                if (valor < 0.5){
                    c1.golpeFraco(c2);
                }
                else{
                    c1.golpeForte(c2);
                }
                System.out.println(c1.getNome() + " golpeia " + c2.getNome());
            }
            //Mu aplica o golpe
            else{
                r = new Random ();
                valor = r.nextFloat();
                if (valor < 0.5){
                    c2.golpeFraco(c1);
                }
                else{
                    c2.golpeForte(c1);
                }
                System.out.println(c2.getNome() + " golpeia " + c1.getNome());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (c1.getVida() > c2.getVida()){
            System.out.println(c1.getNome() + " Venceu!");
        }
        else{
            System.out.println(c2.getNome() + " Venceu!");
        }
    }
}
