/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karstentest;

/**
 *
 * @author tayou
 */
public class KarstenTest {

    static String inverseString(String str)
    {
        String inverseStr = str.charAt(str.length()-1)+"";
        for(int i = 2; i<=str.length(); i++)
            inverseStr +=(str.charAt(str.length()-i)+"");
        return inverseStr;
    }
    
    static int add(int x, int y){

        while (y != 0) 
        {
            int carry = x & y;
            x = x ^ y; 
            y = carry << 1;
        }
        return x;    }
    
    
    static String afterCommaStr(String str){
        return str.substring(0, str.indexOf("."));
    }
    
    public static void main(String args[])
    {
        //Write test code here!!
    }
}
