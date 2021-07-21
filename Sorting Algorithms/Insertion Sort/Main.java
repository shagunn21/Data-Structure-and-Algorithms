package com.company;

public class Main {

    public static void main(String[] args) {
 int[] intArray = {22, 35, -15, 40, 55, -10, 62};
 for(int firstUnSortedIndex= 0; firstUnSortedIndex < intArray.length; firstUnSortedIndex++){
     int newElement= intArray[firstUnSortedIndex];
     int i;
     for(i=firstUnSortedIndex; i>0 && intArray[i-1]> newElement; i--){
         intArray[i]= intArray[i-1];
     }
     intArray[i]= newElement;
 }
 for(int i = 0; i< intArray.length;i++){
     System.out.println(intArray[i]);
 }
    }
}
