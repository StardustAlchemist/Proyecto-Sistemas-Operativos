/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_so;

import java.util.*;

/**
 *
 * @author Cjavi
 */
public class Filosofo implements Runnable
{
    boolean[] Amigos;
    int Id;
    Control control;
    public Filosofo(boolean[] amigos, int id, Control ctrl){
        Amigos = amigos;
        Id = id;
        control = ctrl;
    } 
    
    private eat(){
        Random r = new Random();
        int tiempo = r.nextInt(999);
        int contador = 0;
    }
    
    @Override
    public void run()
    {
        while(true){
            if(!control.filosofos[Id]){
                //Entrar a cola de espera
            }
            while(!control.filosofos[Id]){}//wait
            control.filosofos = Amigos;
        }
    }
}
