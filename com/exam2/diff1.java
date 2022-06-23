/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exam2;
//import com.exam1.mainclass;
import com.exam1.sameclass;
/**
 *
 * @author SUHAS
 */
//diffferent package subclass
public class diff1 extends  sameclass{
    void method()
    {
                                //System.out.println( noMod_a )	;  		// Yes
				//System.out.println( pri_b )	;		// Yes
				System.out.println( pro_c )	;		// Yes
				System.out.println( pub_d )	;
    }
    public static void main(String [] args)
    {
        diff1 d = new diff1();
        d.method();
    }
}
