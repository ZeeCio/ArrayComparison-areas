public class Main {
    /*
    Find the
    1. Most profitable region
    2. Most profitable region/Qtr - max number of each array
    3. Overall total
    4. Deviation from Average Total per Region
    5. Grand total per Qtr
    6. profit per region and compare
     */

    public static void main(String[] args) {

        int [] north = {120, 150, 100, 80};
        int [] south = {100, 149, 123, 91};
        int [] east = {123, 111, 102, 89};
        int [] west = {171, 90, 90, 101};


        int [][]regionsQtrs  = {north, south, east, west};


        int regionalTotal = 0;
        int[] regionalTotalVals = new int [4];

        for (int outerArrInx = 0; outerArrInx < regionsQtrs.length; outerArrInx++ )
        {
            regionalTotal = 0;
            for (int innerArrInx = 0; innerArrInx < regionsQtrs[outerArrInx].length; innerArrInx++ )
            {
                // regionalTotal
                regionalTotal += regionsQtrs[outerArrInx][innerArrInx];
            }
            regionalTotalVals[outerArrInx] = regionalTotal; // Stores each regional total
            System.out.println("The overall total is " + regionalTotal);
        }


    } // End of main
} // End of class