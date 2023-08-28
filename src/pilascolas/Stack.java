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
public class Stack<Item> implements Iterable<Item> {

    //Atributos
    Node<Item> first;

    private class Node<Item> {

        //Atributos
        Item item;
        Node<Item> next;

        //Constructor
        public Node(Item item) {
            this.item = item;
            this.next = null;
        }
        //get y set

        public Node() {
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

    }
    //Constructor

    public Stack() {
        first = null;
    }

    public void push(Item item) {
        Node<Item> nuevo = new Node<Item>(item);
        if (first == null) {
            first = nuevo;
        } else {
            Node<Item> tmp = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = nuevo;

        }
    }

    public Item pop() {
        if (first == null) {
            return null;
        } else {
            Node<Item> tmp = first;
            Node<Item> before = null;
            while (tmp.next != null) {
                before = tmp;
                tmp = tmp.next;
            }
            if (before != null) {
                before.next = null;
            }
            return tmp.item;
        }

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        Node<Item> tmp = first;
        int i = 0;
        while (tmp.next != null) {
            tmp = tmp.next;
            i++;
        }
        return i;
    }

    public void showStack() {

        Node<Item> tmp = first;
        while (tmp != null) {
            System.out.println(tmp.getItem());
            tmp = tmp.next;
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {

        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            this.current = first;
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
