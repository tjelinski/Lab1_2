// tjelinski@student.wsb-nlu.edu.pl
//https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html
//https://achilles.tu.kielce.pl/portal/Members/7637837b75044f12a9338bd380002931/programowanie-obiektowe-java/materialy/instrukcja12-swing.pdf

import javax.swing.JFrame;  // klasa JFrame znajdująca się w pakiecie javax.swing jest podstawową klasa odp. za tworzenie okien [interfejs graficzny]

public class CreateGui {    //publiczna klasa
    public static void main(String[] args) {    //publiczna statyczna metoda main

        JFrame frame = new JFrame();    // tworzenie obiektu odpowiadającego za 'okno' aplikacji [interfejs graficzny]
        frame.setSize(640,480); // 'wielokośc' 'okna' ustawiona na 640x480
        frame.setVisible(true); // true powoduje, że 'okno' będzie widoczne
    }
}