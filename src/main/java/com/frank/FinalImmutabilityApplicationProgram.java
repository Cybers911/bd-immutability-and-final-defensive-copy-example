package com.frank;

public class FinalImmutabilityApplicationProgram {

        private  static int nums[] = {1, 2, 3, 4};

        public static void main(String[] args) {
                System.out.println("-".repeat(80) + "\nHello from main()\n"+"-".repeat(80));

                // Instantiate an aClass object using this class' array
                aClass anObject = new aClass(nums);

                System.out.println("Here are the values in the Arrays");

                showArray();         // Display values in this class' array
                anObject.showClass();// Display the values in the aClass object array

                System.out.println("Change the first element in main array to 999");

                nums[0] = 999;
                showArray();
                anObject.showClass(); // Display the values in the aClass object array

                System.out.println("Get the Array from the aClass object and change the value");

               int [] copiedArray = anObject.getAnArray(); //tomamos el array de la clase aClass y
                //modificamos el valor del primer elemento del array original
                copiedArray[0] = 888;
                anObject.showClass();


                System.out.println("-".repeat(80));

        }  // end of main()

        /******************************************************************************************
         Helper methods
         ******************************************************************************************/
        public static void showArray() {
                System.out.println(("\nContents of array in main(): "));
                for (int i = 0; i < nums.length; i++) {
                        System.out.println("Element " + i + ": " + nums[i]);
                }
        }

}
