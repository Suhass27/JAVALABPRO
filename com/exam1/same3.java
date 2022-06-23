/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exam1;
/**
 *
 * @author SUHAS
 */
//same package with non subclass
public class same3 {
    same3()
    {
        System.out.println("This is same3 class ");
        sameclass ob = new sameclass();
                                System.out.println( ob.noMod_a )	;  		// Yes
				//System.out.println( pri_b );		// Yes
				System.out.println(ob.pro_c );		// Yes
				System.out.println( ob.pub_d );
        
        
    }
}
