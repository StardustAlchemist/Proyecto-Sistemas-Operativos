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
           
        }
        
    }
    
    private void setColores()
    {
        switch(Id)
        {
            case 0:
                 switch(control.Estados[0])
                 {
                case 'h':
                    Principal.EstadoA.setBackground(Color.RED);
                    break;
                case 'c':
                    Principal.EstadoA.setBackground(Color.GREEN);
                    break;
                case 'p':
                    Principal.EstadoA.setBackground(Color.BLUE);
                    break;
                }
                
                break;
                 
              case 1:
                 switch(control.Estados[1])
                 {
                case 'h':
                    Principal.EstadoB.setBackground(Color.RED);
                    break;
                case 'c':
                    Principal.EstadoB.setBackground(Color.GREEN);
                    break;
                case 'p':
                    Principal.EstadoB.setBackground(Color.BLUE);
                    break;
                }
                 
                break; 
                 case 2:
                 switch(control.Estados[0])
                 {
                case 'h':
                    Principal.EstadoC.setBackground(Color.RED);
                    break;
                case 'c':
                    Principal.EstadoC.setBackground(Color.GREEN);
                    break;
                case 'p':
                    Principal.EstadoC.setBackground(Color.BLUE);
                    break;
                }
                break;
                
                case 3:
                 switch(control.Estados[3])
                 {
                case 'h':
                    Principal.EstadoD.setBackground(Color.RED);
                    break;
                case 'c':
                    Principal.EstadoD.setBackground(Color.GREEN);
                    break;
                case 'p':
                    Principal.EstadoD.setBackground(Color.BLUE);
                    break;
                }
                
                break;
                
                 case 4:
                 switch(control.Estados[4])
                 {
                case 'h':
                    Principal.EstadoE.setBackground(Color.RED);
                    break;
                case 'c':
                    Principal.EstadoE.setBackground(Color.GREEN);
                    break;
                case 'p':
                    Principal.EstadoE.setBackground(Color.BLUE);
                    break;
                }
                 
                break;
        }
       
    }
    
    @Override
    public void run()
    {
        
        
        
        while(true){

            Estado = 'p';
            if(!control.filosofos[Id]){
                control.cola.push(this);
            }
            Estado = 'h';
            while(!control.filosofos[Id] || !(!control.cola.isEmpty() && !control.cola.getFirst().Amigos[Id])){}//wait
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
