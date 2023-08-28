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

        System.out.println("Retiro: " + miCola.dequeue());
        System.out.println("___________________________");

        System.out.println("Elementos en la lista ");
        if (miCola.isEmpty()) {
            System.out.println("No hay elementos en la cola");
        } else {
            for (String elem : miCola) {
                System.out.println(elem);
            }
            System.out.println("___________________________");
        }

        System.out.println("Retiro: " + miCola.dequeue());
        System.out.println("___________________________");

        System.out.println("Elementos en la lista:");
        if (miCola.isEmpty()) {
            System.out.println("No hay elementos en la cola");
        } else {
            for (String elem : miCola) {
                System.out.println(elem);
            }
            System.out.println("___________________________");
        }

        System.out.println("Retiro: " + miCola.dequeue());
        System.out.println("___________________________");

        System.out.println("Elementos en la lista:");
        if (miCola.isEmpty()) {
            System.out.println("No hay elementos en la cola");
            System.out.println("___________________________");
        } else {
            for (String elem : miCola) {
                System.out.println(elem);
            }

        }
    }
}
