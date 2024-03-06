package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable()
    {
        String table = "";
        for (int i = 1; i <= 5; i++){

            for (int b = 1; b <= 5; b++){
                table += String.format("%3d |", b*i);
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable()
    {
        String table = "";
        for (int i = 1; i <= 10; i++){

            for (int b = 1; b <= 10; b++){
                table += String.format("%3d |", b*i);
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize)
    {
        String table = "";
        for (int i = 1; i <= tableSize; i++){

            for (int b = 1; b <= tableSize; b++){
                table += String.format("%3d |", b*i);
            }
            table += "\n";
        }
        return table;
    }
}
