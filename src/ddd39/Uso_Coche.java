/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd39;

import javax.swing.JOptionPane;

/**
 *
 * @author Santy
 */
public class Uso_Coche {
    public static void main(String[] args) {
        
        /*coche ca = new coche();
        
        ca.declara_color(JOptionPane.showInputDialog("introduce color"));
        //ca.color="rosa"; encapsulacion ... private no permite uilizar directamente
        ca.declara_largo(100);
        System.out.println(ca.muestra_color()+"\n"+ca.dime_largo());
        System.out.println(ca.dime_datos_generales());
        
        ca.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero"));
        System.out.println(ca.dime_asientos());
        
        ca.configura_climatizador(JOptionPane.showInputDialog("tiene climatizador"));
        System.out.println(ca.dime_climatizador());
        
        System.out.println(ca.peso_coche());
        System.out.println("el precio final del coche es " +ca.precio_coche());*/
        
        coche mivehiculo=new coche();
        mivehiculo.declara_color("rojo");
        
        uso_furgoneta furgon = new uso_furgoneta(1300,600);
        furgon.declara_color("verde");
        furgon.configura_asientos("si");
        furgon.configura_climatizador("si");
        
        System.out.println(furgon.dameDatosFurgon());
        System.out.println("");
            
        System.out.println(mivehiculo.dime_datos_generales());
    }
}
