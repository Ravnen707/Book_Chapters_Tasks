package SkoleOpgaver.Arrays;



public class ConstantArray {
    static String[] colorx = {"Red", "Blue", "Green", "Cyan", "Purple" };
    static String[] y = {colorx[0],colorx[1],colorx[2], colorx[3],colorx[4]};
    Colors Colors;

    public ConstantArray(Colors color) {
        this.Colors = color;
    }

    public static void main(String[] args) {
        int colorz = 3;
        System.out.println(y[colorz]);

        ConstantArray color;
        color = new ConstantArray(SkoleOpgaver.Arrays.Colors.Blue);
        System.out.println(color.Colors);

    }
}
