/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task_1;

/**
 *
 * @author User
 */
public class Ice_Task_1 {

    public static void main(String[] args) {
       
    }
    public static void bubblesort(double[] valuesToSort)
    {
         // Bubble sort (descending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1 - i; j++) {          
                if (valuesToSort[j] < valuesToSort[j + 1]) {     
                    double temp = valuesToSort[j];
                    valuesToSort[j] = valuesToSort[j + 1];
                    valuesToSort[j + 1] = temp;
                }
            }
        }
    }
}
