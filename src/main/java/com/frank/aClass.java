package com.frank;

import java.util.Arrays;

public class aClass {

        private int[] anArray;

        public aClass(int[] intArray) {
               // anArray = intArray; change to a defensive copy so the reference location is a//
                // completely independent of the original array
                anArray = Arrays.copyOf(intArray, intArray.length);
                //No trnsfiere el array hacia un nuevo array para que no pueda ser modificado
                // de la instancia de la clase.
        }

        public int[] getAnArray() {
                //return anArray; Instead of returning a reference of the data we
                // return a reference from the copy

                return Arrays.copyOf(anArray, anArray.length);  // create a copy of the array
                // and return it.  //
                // This way, we ensure that the array is not modified by the original instance.  //
                // This is a defensive copy.  //
                // If we don't make a copy, then changing the array in the original instance would
                // change the array in the copy, which is not what we want.  //
                // So, we make a copy to make sure the array remains independent of the original
                // instance.  //
                // This defensive copy is a good practice to follow for immutability.  //
                // Also, note that this defensive copy is not a deep copy. It's a shallow copy,
                // meaning it creates a new array and copies the references to the elements in
                // the original array.  //

        }

        public void showClass() {
                System.out.println(("\nContents of array in aClass: "));
                for (int i = 0; i < anArray.length; i++) {
                        System.out.println("Element " + i + ": " + anArray[i]);
                }
        }
}
