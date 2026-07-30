/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task_1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ice_Task_1 {

     public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = rs.nextInt();

        // Columns: 0 - Student number, 1 - Challenge1, 2 - Challenge2, 3 - Challenge3, 4 - Total
        int[][] students = new int[numStudents][5];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("  Student number: ");
            students[i][0] = rs.nextInt();
            System.out.print("  Challenge 1 mark: ");
            students[i][1] = rs.nextInt();
            System.out.print("  Challenge 2 mark: ");
            students[i][2] = rs.nextInt();
            System.out.print("  Challenge 3 mark: ");
            students[i][3] = rs.nextInt();

            
            students[i][4] = students[i][1] + students[i][2] + students[i][3];
        }

      
        System.out.println("\n--- Original Student Records ---");
        //displayTable(students);

       
        bubbleSortDescending(students);

        
        System.out.println("\n--- Sorted by Total Marks (Descending) ---");
       

        
    }
    public static void bubbleSortDescending(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j][4] < array[j + 1][4]) {
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
