
package stakMain;
import stak.stack;
public class stackMain {

    public static void main(String[] args) {
        stack Tumpukan = new stack (5);
        Tumpukan.push(17);
        Tumpukan.push(25);
        Tumpukan.push(50);
        Tumpukan.push(7);
        Tumpukan.push(100);
      
        while(!Tumpukan.kosong())
        {
            long nilai = Tumpukan.pop();
            System.out.print(nilai);
            System.out.println(" ");
        }  
       
        while(Tumpukan.penuh())
        {
         long nilai1 = Tumpukan.pop();
         System.out.print(nilai1);
         System.out.println("Maaf Stack Sudah Penuh");
       
        }
        System.out.println("");
    }
}
 
   
    

