package com.ua.vtkachenko.easyTask12;

/* Write loop that show
 case:1 1; -1
case:2 2; -3
case:3 3; -5
.............
case 10 10; ...
  */
public class EasyTask12 {

    public static void main(String[] args) {

        for (int i = 1, j = -1; i < 11; i++, j -=2) {
            System.out.println("case:" + i + " " + i + ";" + j);
        }
    }
}
