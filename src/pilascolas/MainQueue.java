/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolas;

/**
 *
 * @author Guest
 */
public class MainQueue {
    
    
public static void main(String[] args) {
    Queue<String> miCola = new Queue<String>();
    miCola.enqueue("Maria");
    miCola.enqueue("Juan");
    miCola.enqueue("Pedro");
    
    System.out.println("Elementos de la lista:");
    for (String elem : miCola) {
        System.out.println(elem);
    }

    //miCola.showQueue();
    System.out.println("Retiro: " + miCola.dequeue());
    
    System.out.println("Elementos en la lista ");
    for (String elem : miCola) {
        System.out.println(elem);
    }
    
    System.out.println("Retiro: " + miCola.dequeue());
    
    System.out.println("Elementos en la lista");
    for (String elem : miCola) {
        System.out.println(elem);
    }
}
}
