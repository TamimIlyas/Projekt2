package Programme;

public class Array {
    public  static void main(String[] args) {
        String[] namen = new String[5];
        namen[0] = "ich";
        namen[1] = "er";
        namen[2] = "sie";
        namen[3] = "es";
        namen[4] = "wir";
        System.out.println(namen[4]);
        for (int i = 0; i < namen.length; i++){
            System.out.println(namen[i]);
    }
}}
