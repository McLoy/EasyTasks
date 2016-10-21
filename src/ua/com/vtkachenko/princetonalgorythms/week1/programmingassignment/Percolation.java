package ua.com.vtkachenko.princetonalgorythms.week1.programmingassignment;

public class Percolation {

    private int[][] grid;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n){

        grid = new int[n][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 1;
            }
        }
    }

    // open site (row, col) if it is not open already
    public void open(int row, int col){

        if (grid[row][col] == 1)
            grid[row][col] = 0; //means opened

    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col){

        if (grid[row][col] == 0)
            return true;
        else
            return false;

    }

    // is site (row, col) full?
    public boolean isFull(int row, int col){

        if (grid[row][col] == 2)
            return true;
        else
            return false;

    }

    // does the system percolate?
    public boolean percolates(){

        boolean percolates = false;

            //

        return percolates;
    }


    // test client (optional)
    public static void main(String[] args){

        int size = 4;
        Percolation p = new Percolation(size);
        System.out.println("Grid " + size + "x" + size + " percolates: " + p.percolates());

    }
}
