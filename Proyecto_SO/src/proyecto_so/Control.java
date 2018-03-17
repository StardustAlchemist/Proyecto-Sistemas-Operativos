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
    boolean[] filosofos;
    LinkedList<Filosofo> cola = new LinkedList<>();
    int Contador = 0;
    char[] Estados = {'p', 'p', 'p', 'p', 'p'};
    public Control(boolean[] fs){
        filosofos = fs;
    }
}
