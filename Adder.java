package arithmetic;
import java.util.*;
     class Arithmetic {
         int Add(int x, int y){
             return x+y;
         }
     }
     
    class Adder extends Arithmetic{
        @Override
        int Add(int x, int y){
            return x+y;
        }
    
    public static void main(String[] args){
        Adder w = new Adder();
        System.out.println("My class is Arithmetic: ");
        System.out.println(w.Add(5, 10));
        System.out.println(w.Add(6, 4));
        System.out.println(w.Add(30, 10));
    }
    } 

     
