/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafibonnaci;

import java.io.*;
import java.math.BigInteger;
public class JavaFibonnaci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*System.out.println("Ingrese N");
        String Ns = br.readLine();
        int N = Integer.parseInt(Ns);
        System.out.println(N);*/
        byte nbytes=1;
        BigInteger f0 = BigInteger.valueOf(0);
        BigInteger f1 = BigInteger.valueOf(1);
        for(int i=0;nbytes!=5;i++)
        {

            try
            {
                BigInteger aux = f1;
                f1=f1.add(f0);
                f0=aux;
                switch(nbytes){
                    case 1:
                        if(f1.compareTo(BigInteger.valueOf(Byte.MAX_VALUE) )>0)
                        {
                           System.out.println("Overflow con Byte en "+(i-1));
                           nbytes=2;
                        }
                        break;
                    case 2:
                        if(f1.compareTo(BigInteger.valueOf(Short.MAX_VALUE) )>0)
                        {
                           System.out.println("Overflow con Short en "+(i-1));
                           nbytes=3;
                        }
                        break;
                    case 3:
                        if(f1.compareTo(BigInteger.valueOf(Integer.MAX_VALUE) )>0)
                        {
                           System.out.println("Overflow con Integer en "+(i-1));
                           nbytes=4;
                        }
                        break;
                    case 4:
                        if(f1.compareTo(BigInteger.valueOf(Long.MAX_VALUE) )>0)
                        {
                           System.out.println("Overflow con Long en "+(i-1));
                           nbytes=5;
                        }
                        break;
                    default:
                        break;
                }
                System.out.println(f1);//muestra el ultimo valor de la secuencia de fibonacci
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }  
}
