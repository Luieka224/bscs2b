class Pyramid {
    public static void main(String[] args) {
        rectangle(4,10);
        halfPyramid('l', 5);
        halfPyramid('r', 5);
        fullPyramid(5, '*');
        fullPyramid(5);
        numPyramid(5);
    }

    /**
     * 
     * Prints a full pyramid that increments oddly.
     * Prints number from max value to lowest and back to max value.
     * 
     * @param dim Dimension of the pyramid
     */
    private static void numPyramid(int dim) {
        for (int j = 1; j <= dim; j++) {
            for(int i = 1; i <= dim-j; i++) System.out.print("  ");
            for(int i = j; i > 1; i--) System.out.print(i+" ");
            for(int i = 1; i <= j; i++) System.out.print(i+" ");
            System.out.println();
        } 
    }

    /**
     * 
     * Prints a full pyramid that increments oddly.
     * If the sym is {@code not null}, this
     * function will be overloaded.
     * 
     * @param dim Dimension of the pyramid
     * @param sym Symbol of the pyramid.
     */
    private static void fullPyramid(int dim) {
        for (int i = 1, j = 1; i <= dim; i++, j+=2) {
            for (int k = 0; k < dim-i; k++) System.out.print("  ");
            for (int k = 0; k < j; k++) System.out.print(i+" ");
            System.out.println();
        }
    }

    /**
     * 
     * Prints a full pyramid that increments oddly.
     * If the sym is null, it will {@code  }.
     * 
     * @param dim Dimension of the pyramid
     * @param sym Symbol of the pyramid.
     */
    private static void fullPyramid(int dim, char sym) {
        for (int i = 1, j = 1; i <= dim; i++, j+=2) {
            for (int k = 0; k < (dim*2)-j; k++) System.out.print(" ");
            for (int k = 0; k < j; k++) System.out.print(sym+" ");
            System.out.println();
        }
    }


    /**
     * 
     * Prints a full pyramid as indicated by the {@code dim}
     * parameter. If {@code dim} is null, negative integer,
     * or equal to 0, nothing will be printed
     * 
     * @param dir Indicates which direction the longer side of the pyramid will be
     * @param dim Specify dimension of the pyramid.
     * 
     */
    private static void halfPyramid(char dir, int dim) {
        if(dir == 'l')
            for (int i  = 0; i < dim; ++i) {
                for (int j = 0; j <= i; j++) System.out.print("* ");
                System.out.println();
            }
        else {
            for (int i  = 0; i < dim; ++i) {
                for (int j = 1; j < dim-i; j++) System.out.print("  ");
                for (int j = 0; j <= i; j++) System.out.print("* ");
                System.out.println();
            } 
        }
    }

    /**
     * 
     * Prints a rectangle with. {@code width} and {@code length}
     * should be {@code int}.
     * 
     * @param width Specifiy the width of the rectangle
     * @param length Specify the length of the rectangle
     * 
     */
    private static void rectangle(int width, int length) {
        for(int i = 1; i <= width*length; i++)
            System.out.print(i%length != 0 ? "* " : "* \n");
    }
}