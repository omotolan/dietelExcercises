package Chapter7;

public class PixelQuantization {
    public static void main(String[] args) {
        int[] pixels = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};

        System.out.printf("%s%20s%n", "pixel value", "quantized value");
        for (int i = 0; i < pixels.length; i++) {
            System.out.printf("%d%s%d %20d%n", 21+20,"to", (i *20), pixels[i]);
        }
    }
}
