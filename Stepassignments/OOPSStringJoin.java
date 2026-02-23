package Stepassignments;

public class OOPSStringJoin {

    public static void main(String[] args) {
        // Defining the delimiter for consistent 3-space gaps between letters
        String gap = "   ";

        // Constructing each line of the "OOPS" visual pattern using String.join()
        System.out.println(String.join(gap, " *** ", " *** ", "**** ", "****"));
        System.out.println(String.join(gap, "*   *", "*   *", "*  *", " * "));
        System.out.println(String.join(gap, "*   *", "*   *", "*  *", " * "));
        System.out.println(String.join(gap, "*   *", "*   *", "**** ", "**** "));
        System.out.println(String.join(gap, "*   *", "*   *", "* ", "      *"));
        System.out.println(String.join(gap, "*   *", "*   *", "* ", "      *"));
        System.out.println(String.join(gap, " *** ", " *** ", "* ", "  **** "));
    }
}
