package controller;

import model.Score;
import model.Vak;

import java.util.Scanner;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class BSAmonitorLauncher {

    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);
        Vak[] mijnVakken = new Vak[7];
        mijnVakken[0] = new Vak("Project Fasten Your Seatbelts", 12, 5.5);
        mijnVakken[1] = new Vak("Programming", 3, 5.5);
        mijnVakken[2] = new Vak("Databases", 3, 5.5);
        mijnVakken[3] = new Vak("Personal Skills", 2, 5.5);
        mijnVakken[4] = new Vak("Project Skills", 2, 5.5);
        mijnVakken[5] = new Vak("OOP 1", 3, 5.5);
        mijnVakken[6] = new Vak("User Interaction", 3, 5.5);


        double totalBehaaldePunten = 0;

        Score[] mijnScore = new Score[mijnVakken.length];
        for (int teller = 0; teller < mijnScore.length; teller++) {
            System.out.printf("%s: ",mijnVakken[teller].getNaam());
            double cijfer = toetsenbord.nextDouble();
            mijnScore[teller] = new Score(mijnVakken[teller].getNaam(),cijfer);
            if (cijfer >= 5.5) {
                mijnScore[teller].setBehaaldePunten(mijnVakken[teller].getPunten()); // Krediler kaydediliyor
                totalBehaaldePunten += mijnVakken[teller].getPunten();
            } else {
                mijnScore[teller].setBehaaldePunten(0);
                mijnVakken[teller].setPunten(0);
            }

        }

        for (int teller = 0; teller < mijnScore.length; teller++) {

            System.out.printf("%s: %.1f Behaalde punten: %.1f\n",mijnVakken[teller].getNaam(), mijnScore[teller].getCijfer(),mijnVakken[teller].getPunten() );
        }

            System.out.printf("Totale behaalde punten: %.1f\n", totalBehaaldePunten);
    }
}
