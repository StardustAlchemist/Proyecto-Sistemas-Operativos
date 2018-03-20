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
        control.Estados[Id] = 'c';
        Random r = new Random();
        int tiempo = 5000;
        for (int i = 0; i < tiempo; i++) {
           System.out.println(Id + " eating");
        }
        
    }
    
    private void think(){
        control.Estados[Id] = 'h';
        Random r = new Random();
        int tiempo = 5000;
        for (int i = 0; i < tiempo; i++) {
           System.out.println(Id + " thinking");
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
                 switch(control.Estados[2])
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
    @SuppressWarnings("empty-statement")
    public void run()
    {
        
        
        
        while(true){

            control.Estados[Id] = 'p';
            setColores();
            think();
            control.Estados[Id] = 'h';
            setColores();
            //if(!control.filosofos[Id]){
                control.cola.add(this);
            //}
            while(control.Contador >= 2 || (Id != control.cola.getFirst().Id || !control.filosofos[Id]) && (!control.filosofos[Id] || !control.cola.getFirst().Amigos[Id])){ System.out.println(Id + " waiting"); }//wait
            /////////////////////////////ZONA////////////////////////////////////////////
            control.filosofos = Amigos;
            if(Id == control.cola.getFirst().Id){
                control.cola.remove();
            }
            control.Contador++;
            control.Estados[Id] = 'c';
            setColores();
            eat();
            control.Contador--;
            /////////////////////////////CRITICA////////////////////////////////////////////
        }
    }
}
