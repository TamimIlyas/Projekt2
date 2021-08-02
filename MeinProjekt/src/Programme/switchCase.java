package Programme;

public class switchCase {
    public static void main(String[] args) {
        double wert1 = 100.0;
        double wert2 = 20.0;
        double ergebnis = 0.0;
        char opCode = 'd';


        switch (opCode) {
            case 'a':
                ergebnis = wert1 + wert2;
                break;
            case 'b':
                ergebnis = wert1 - wert2;
                break;
            case 'c':
                ergebnis = wert1 * wert2;
                break;
            case 'd':
                if (wert2 !=0)
                ergebnis = wert1 / wert2;
                break;
            default:
                System.out.println("ungültig opCode: " + opCode);
            ergebnis = 0.0d;
            break;


        }
        System.out.println(ergebnis);
    }
}