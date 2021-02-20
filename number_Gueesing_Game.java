import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int i=1;
        Random r=new Random();

        int sayi=r.nextInt(10);             // Burada 0-10 arası tahmin yaptırır. Değeri arttırırsanız sıfır ile o değer arası tahmin yaptırır
        while(true){
            String tahmin=JOptionPane.showInputDialog("Tahmin Giriniz:");
            int t=Integer.parseInt(tahmin);
            if(t==sayi){
                String message="Tahmin doğru! - "+i+". tahminde bildiniz";
                JOptionPane.showMessageDialog(null,message);
                break;
            }
            else
                i++;
        }
    }
}
