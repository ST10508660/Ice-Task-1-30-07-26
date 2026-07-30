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
       Scanner rs= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int noStudents=rs.nextInt();
        int[][] storage;
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
