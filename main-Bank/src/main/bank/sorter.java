/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bank;

import java.util.ArrayList;

/**
 *
 * @author Mario Cornejo
 */
public class sorter {
    //base to get the code of sorting
      public static ArrayList<Employee> quickSort(ArrayList<Employee> list) {
        if (list.size() <= 1) return list; 

        int mid = list.size() / 2;
        Employee pivot = list.get(mid);
        ArrayList<Employee> left = new ArrayList<>();
        ArrayList<Employee> right = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i == mid) continue;
            if (list.get(i).getName().compareToIgnoreCase(pivot.getName()) < 0) left.add(list.get(i));
            else right.add(list.get(i));
        }
         //Recursive
         // sortedLeft + pivot + sortedRight
        ArrayList<Employee> result = quickSort(left);     
        result.add(pivot);
        result.addAll(quickSort(right));
        return result;                    
    }
}
