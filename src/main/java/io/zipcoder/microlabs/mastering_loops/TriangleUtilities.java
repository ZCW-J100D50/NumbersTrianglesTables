package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows)
    {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++){

            for (int b = 1; b <= i; b++){
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars)
    {
        String width = "";
        for (int i = 0; i < numberOfStars; i++){
            width += "*";
        }
        return width;
    }

    public static String getSmallTriangle()
    {
        return getTriangle(5);
    }

    public static String getLargeTriangle()
    {
        return getTriangle(15);
    }
}
