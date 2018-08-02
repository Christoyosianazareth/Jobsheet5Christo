package Latihan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GL553VD
 */
public class OperatorBitwise {
    public static void main(String[] args){
        int x = 30; //dikonversi ke biner = 00001100
        int y = 27; //dikonversi ke biner = 00010100
        int z;
        z=x|y;
        System.out.println("hasil operasi bitwise OR:"+z);
        z=x&y;
        System.out.println("hasil operasi bitwise AND:"+z);
        z=x^y;
        System.out.println("hasil operasi bitwise XOR:"+z);
        z=~x;
        System.out.println("hasil operasi bitwise NOT:"+z);
        z=x<<y;
        System.out.println("hasil operasi bitwise shift left:"+z);
        z=x>>y;
        System.out.println("hasil operasi bitwise shift right:"+z);
    }
}
