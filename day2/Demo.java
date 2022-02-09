package day2;
// import java.util.Scanner;
class Demo {
    static int i;
    static long l;
    static byte by;
    static short s;
    static float f;
    static double d;
    static char c;
    static boolean bl;

    public static void main(String[] args) {
        System.out.println(" default value of int " + i + " long " + l + " byte " + by + " short " + s + " float " + f
                + " double " + d + " char " + c + " boolean " + bl);
        i = 2;
        l = 2;
        by = 2;
        s = 2;
        f = 2;
        d = 2;
        c = '2';
        bl = false;
        System.out.println(" value of int " + i + " long " + l + " byte " + by + " short " + s + " float " + f
                + " double " + d + " char " + c + " boolean " + bl);

    }
}