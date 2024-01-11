package com.company;

public class Practice_Set_06 {
    public static void main(String[] args) {

//     Q1 ADDING THE ARRAY LENGTH 5
//      float [] num={29.5f,24.45f,24.10f,54.54f,56.25f};
      /*    float sum=0;
        for (int i= 0; i<num.length;i++){
            sum= sum+num[i];
        }
        System.out.println(sum);



       */


//      Q2 SEARCHING ELEMENT IN ARRAY
    /* float a= 24.20f;
      boolean isInArray= false;

        for (float element:num){
            if (element==a ){
                isInArray=true;
                break;
            }


        }
        if (isInArray){
            System.out.println("The number is present in array.");
        }else {
            System.out.println("The number is not present in array.");
        }


     */

//        Q3 CALCULATING THE AVERAGE MARKS IN ARRAYS
        /*int [] marks = {60,70,55,80,95,84,76,49};
         float sum = 0;

         for (int element : marks){
             sum = sum+element;

         }
        float avg= sum/marks.length ;
        System.out.println("The average marks in Physics is :"+avg);


         */
//        Poblem 4

       /* int [][] num = new int [2][3];
        num[0][0] = 100;
        num[0][1] = 200;
        num[0][2] = 300;
        num[1][0] = 400;
        num[1][1] = 500;
        num[1][2] = 600;

        int [][] num1 = new int[2] [3  ];
        num1[0][0] = 10;
        num1[0][1] = 20;
        num1[0][2] = 30;
        num1[1][0] = 40;
        num1[1][1] = 50;
        num1[1][2] = 60;

     int [][] resultm= new int[2][3];

     for (int i =0 ; i<num.length;i++){
         for (int j=0;j<num[i].length;j++){
             resultm[i][j]= num[i][j]+num1[i][j];
         }
     }
        for (int i =0 ; i<resultm.length;i++){
            for (int j=0;j<resultm[i].length;j++){
                System.out.print(resultm[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        */
    /*
//        Q5 REVERSING THE ARRAY

        int [] arr= {1,2,3,4,5,6,7};
        int l= arr.length;
        int temp;
        int n = Math.floorDiv(l,2);

        for(int i=0; i<n;i++){
//            for swappin
//                    a[i]= a[l-i-1]
            temp= arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1] =temp;

        }
        for (int m   :arr
        ){
            System.out.println(m);
        }


     */


//Q6 findin the maximum

        int [] arr= {1,2,3,4,5,6,7};
        int max =0;
        for (int i = 0; i<arr.length;i++) {
            if (max<arr[i]){
                max=arr[i];

            }
        }
        System.out.println("The maximum is :"+max);




//        Q7 FINDING MINIMUM
        int min =max;
        for (int i = 0; i<arr.length;i++) {
            if (min>arr[i]){
                min=arr[i];

            }
        }
        System.out.println("The maximum is :"+min);




//Q8 FINDING THE ARRAY IS SORTED OR NOT
    int [] mat = {24,20,58,64,58};
    boolean isSorted = true;
    for (int i =0 ; i <mat.length-1; i++){
        if (mat[i]>mat[i+1]){
            isSorted=false;
        }

    }
if (isSorted){
    System.out.println("The array is sorted.");

}else {
    System.out.println("The array is not sorted.");
}



    }
}
