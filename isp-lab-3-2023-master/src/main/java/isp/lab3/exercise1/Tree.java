/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise1;

/**
 *
 * @author User
 */
public class Tree {

    private int hight;

    //contructor fara argumente
    public Tree() {
        this.hight = 15;
    }

    public void grow(int meters) {
        if (meters > 1) {
            System.out.println("Tree is growing with" + meters);
            this.hight += meters;
        } else {
            System.out.println("Invalid metters value.");
        }
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return "Tree{" + "hight=" + hight + '}';
    }
//creare obiect nou TREE cu new

    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.grow(5);
        t1.grow(0);
        System.out.println("t1");
    }
}
