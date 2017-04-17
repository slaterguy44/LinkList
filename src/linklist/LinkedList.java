/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author 55slaterbc30
 */
public class LinkedList {

    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int index, double data) {
        Link newLink = new Link(index, data);
        newLink.next = first;
        first = newLink;

    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.index != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.index != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Link current = first;

        while (current != null) {
            sb.append(current.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1, 25.1);
        list.insertFirst(2, 39.2);
        list.insertFirst(3, 10.3);
        System.out.println(list.toString());
        list.deleteFirst();
        list.delete(2);
        list.find(1);
        list.find(4);
        System.out.println(list.toString());
        System.out.println(list.find(1));
        System.out.println(list.find(4));
        
    }
}
