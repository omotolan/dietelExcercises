package Chapter5;

public class Patterns {
    public static void main(String[] args) {
        triangle(7);
        System.out.println();
        invertedTriangle(7);
        System.out.println();
        trianglee(7);


    }

    public static void triangle(int triangleSize) {
        // the outer loop for how number of rows i want the triangle to have
        for (int rows = 1; rows < triangleSize; rows++) {
            // how many stars do i want to print at each row?
            // cause i want the number of stars to increment by one, i'm using the row index since it increases by one also
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("* ");

            }
            // i want a new line to be printed after each row i.e all row should be on different lines
            System.out.println();
        }
    }

    public static void invertedTriangle(int triangleSize) {
        for (int rows = 1; rows <= triangleSize; rows++) {
            //prints out the value the column has after each iteration. i.e value of columns before the comparison sign
            for (int columns = triangleSize; columns >= rows; columns--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void trianglee(int triangleSize) {
        for (int rows = 1; rows < triangleSize; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("* ");

            }
            System.out.println();
            for (int columns = triangleSize; columns >= rows; columns--) {
                System.out.print("* ");

            }

        }

    }
}
