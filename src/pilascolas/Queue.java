/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolas;
import java.util.Iterator;
/**
 *
 * @author Guest
 */
public class Queue<Item> implements Iterable<Item> {

    // Atributos
    private Node<Item> frente;
    private Node<Item> atras;

    private class Node<Item> {
        Item item;
        Node<Item> next;

        public Node(Item item) {
            this.item = item;
            this.next = null;
        }
    }

    // Constructor
    public Queue() {
        frente = null;
        atras = null;
    }

    public void enqueue(Item item) {
        Node<Item> nuevo = new Node<Item>(item);
        if (atras == null) {
            frente = nuevo;
            atras = nuevo;
        } else {
            atras.next = nuevo;
            atras = nuevo;
        }
    }

    public Item dequeue() {
        if (frente == null) {
            return null;
        } else {
            Node<Item> tmp = frente;
            frente = frente.next;
            if (frente == null) {
                atras = null; 
            }
            return tmp.item;
        }
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        int count = 0;
        Node<Item> tmp = frente;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public void showQueue() {
        Node<Item> tmp = frente;
        while (tmp != null) {
            System.out.println(tmp.item);
            tmp = tmp.next;
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(frente);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> frente) {
            this.current = frente;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                return null;
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
