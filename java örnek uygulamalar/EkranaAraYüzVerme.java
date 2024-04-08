package ekrana.ara.yüz.verme;

import javax.swing.JOptionPane;

public class EkranaAraYüzVerme {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "1.sayı..:");
        String s2 = JOptionPane.showInputDialog(null, "2.sayı..:");
        int toplam = Integer.parseInt(s1) + Integer.parseInt(s2);

        JOptionPane.showInputDialog(null, "Toplam=" + toplam);

        JOptionPane.showInputDialog(null, "İYİ GÜNLER");

    }

}
