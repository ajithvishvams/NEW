public class PrimitiveDataTypes {
    public static void  main(String args[]){
        // interger
        byte by = 2;
        short sh = 10;
        int num = 1456;
        long ln = 123455l;

        // Float
        float fl = 8.6f;
        double db = 8.5;

        // Character
        char c = 'j';

        // Boolean
        boolean bl = true;

        int base2 = 0b101;
        int hexaDecimal = 0xE7;
        System.out.println(base2);
        System.out.println(hexaDecimal);

        int value = 10_00_00_000;
        double distance = 12e10;
        System.out.println(value);
        System.out.println(distance);

        char letter = 'a';
        letter++;
        System.out.println(letter);
    }
}
