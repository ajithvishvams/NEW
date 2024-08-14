public class TypeConversion {
    public static void main(String arg[]){
        byte by = 127;
        int b = 257;
        byte a = (byte) b;
        System.out.println(a);

        float f = 5.9f;
        int floatToInt = (int) f;
        System.out.println(floatToInt);

        byte c = 10;
        byte d = 30;
        int result = c*d;
        System.out.println(result);
    }
}
