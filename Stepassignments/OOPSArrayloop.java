package Stepassignments;

public class OOPSArrayloop {
    public static void main(String[] args) {
        String gap = "   ";

        // UC4 Requirement: Storing banner lines in a String array using String.join()
        String[] bannerLines = {
            String.join(gap, " *** ", " *** ", "**** ", " ****"),
            String.join(gap, "*   *", "*   *", "*  *", " * "),
            String.join(gap, "*   *", "*   *", "*  *", " * "),
            String.join(gap, "*   *", "*   *", "**** ", " *** "),
            String.join(gap, "*   *", "*   *", "* ", "       *"),
            String.join(gap, "*   *", "*   *", "* ", "       *"),
            String.join(gap, " *** ", " *** ", "* ", "   **** ")
        };

        // UC4 Requirement: Using a loop to print the array elements
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
