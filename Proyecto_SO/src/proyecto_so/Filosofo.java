/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_so;

import java.awt.Color;
import java.util.*;

/**
 *
 * @author Cjavi
 */
public class Filosofo implements Runnable
{
   
    boolean[] Amigos;
    int Id;
    char Estado;
    Control control;
    
    
    
    public Filosofo(boolean[] amigos, int id, Control ctrl){
        Amigos = amigos;
        Id = id;
        control = ctrl;
        
       
    } 
    
    private void eat(){
        Estado = 'e';
        Random r = new Random();
        int tiempo = r.nextInt(9999);
        for (int i = 0; i < tiempo; i++) {
            System.out.println("... \n");
        }
        
    }
    
    @Override
    public void run()
    {

        Principal.EstadoA.setBackground(Color.red);
        Principal.EstadoB.setBackground(Color.GREEN);
        Principal.EstadoC.setBackground(Color.blue);
        Principal.EstadoD.setBackground(Color.GREEN);
        Principal.EstadoE.setBackground(Color.blue); //Ahora desde aqui podes cambiar los colores.

        
        while(true){

            Estado = 'p';
            if(control.filosofos[Id]){

              //  control.cola.push(this);
                //control.Espera[0].Amigos[Id]
                //Entrar a cola de espera

                control.cola.add(this);

            }
            
            while(!control.filosofos[Id] || (!control.cola.isEmpty() && !control.cola.getFirst().Amigos[Id])){}//wait
            /////////////////////////////ZONA////////////////////////////////////////////
            boolean[] filCombo = {//Combinacion de las restricciones del que esta comiendo con las de la cabeza de la cola
                Amigos[0] && control.cola.get(0).Amigos[0],
                Amigos[1] && control.cola.get(0).Amigos[1],
                Amigos[2] && control.cola.get(0).Amigos[2],
                Amigos[3] && control.cola.get(0).Amigos[3],
                Amigos[4] && control.cola.get(0).Amigos[4],
            };
            
           
            control.filosofos = filCombo;
            eat();
            control.Contador--;
            /////////////////////////////CRITICA////////////////////////////////////////////
        }
    }
}
