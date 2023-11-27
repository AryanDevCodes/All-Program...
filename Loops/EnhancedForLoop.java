    package Loops;
    public class EnhancedForLoop{
        public static void main(String[] args) {
            // int arr[] =  {5,54,2,7};
            // for(int a : arr){             Normal Array
            //     System.out.print(a);
            // },
               
            // 2D Array

            // int [][] arr = {

            //           {5,6,7,8},
            //           {6,8,6,9},
            //           {7,8,5,30}

            //                };
            
            // for(int a1[] : arr){
            //     for(int a : a1){
            //         System.out.print(a + " ");
            //     }
            //     System.out.println();
            // }
      
             // Jagged Array
             
                int [][] arr = {
                        {8,5,4,1},
                        {7,8,2},
                        {1,2,6,3,9}
                };
                for(int a[] : arr){
                    for(int b : a){
                        System.out.print(b + " ");
                    }
                    System.out.println();
                }
        }
    }