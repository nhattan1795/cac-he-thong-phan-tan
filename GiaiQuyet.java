/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.libs.ThuatToan;

/**
 *
 * @author tân
 */
public class GiaiQuyet  extends UnicastRemoteObject implements ThuatToan{


    public GiaiQuyet() throws RemoteException {     
   
    }
    
    
   @Override
       public int [] ketQua(int[] array) throws RemoteException{ 
        System.out.println("");
        System.out.print( "Dãy Số Nhập vào - " );  
         for (int i=0; i < array.length; i++) System.out.print( array[i] + " " );        
             System.out.println();
             for (int g = array.length/2; g > 0; g /= 2)
                for (int i = g; i < array.length; i++)
                for (int j = i-g; j >= 0; j -= g)
                  if (array[j] > array[j+g]) {
                    int temp = array[j];
                    array[j] = array[j+g];
                    array[j+g] = temp;
                  }
            return array;
       }

    
    }
    