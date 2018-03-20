/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_so;

import java.util.LinkedList;

/**
 *
 * @author Gabriel
 */
public class Control {
    volatile boolean[] filosofos;
    volatile LinkedList<Filosofo> cola = new LinkedList<>();
    volatile int Contador = 0;
    volatile char[] Estados = {'p', 'p', 'p', 'p', 'p'};
    public Control(boolean[] fs){
        filosofos = fs;
    }
}
