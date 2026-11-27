/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bank;

/**
 *
 * @author Mario Cornejo
 */
public class EmployeeTree {
    
    
    
       private static class Node {
        Employee data;
        Node left, right;
        Node(Employee data) { this.data = data; }
    }

    private Node root;

    // Level-order insertion: find the first free spot (left first, then right) using a FIFO queue
    public void insert(Employee e) {
        Node newNode = new Node(e);
        if (root == null) { root = newNode; return; }

       
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == null)  { current.left = newNode;  return; }
            if (current.right == null) { current.right = newNode; return; }
            queue.add(current.left);
            queue.add(current.right);
        }
    }

    
}
