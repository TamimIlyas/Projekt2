package Programme;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Rechnenmaschiene {

    public  static void main(String[] args) {
        double wert1 = 100.0;
        double wert2 = 20.0;
        double ergebnis = 0.0;
        char opCode = 'd';

        if (opCode == 'a')
            ergebnis = wert1 + wert2;
        else if (opCode == 'b')
            ergebnis = wert1 - wert2;
        else if (opCode == 'c')
            ergebnis = wert1 * wert2;
        else if (opCode == 'd')
            ergebnis = wert1 / wert2;
        else ergebnis = 0.0d;

        System.out.println(ergebnis);



        }

    }

