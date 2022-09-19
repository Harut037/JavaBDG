package homework_9;



import java.util.Arrays;

public abstract class Sorting{
 public static void main(String[] args) {
 bubbleSorting();
     System.out.println("\n");

     int[] arr = {1,7,1,4,11,11,112,11};
     System.out.println("Un sorting array: " + Arrays.toString(arr));

     mergeSorting(arr);
     System.out.print("Sorting array: " + Arrays.toString(arr));

   }

   public static int[] bubbleSorting() {

  int[] array = new int[14];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * 14);
    }
    System.out.println("Un sorting array: " + Arrays.toString(array) );

 boolean status = true;
 int tmp;
 while(status){
  status = false;
  for (int i = 0; i < array.length - 1; i++) {
   if(array[i] > array[i+1]){
    status = true;
      tmp = array[i];
      array[i] = array[i + 1];
      array[i + 1] = tmp;
   }
  }
 }
    System.out.println("Sorting array: " + Arrays.toString(array));
 return array;
   }


  private static void mergeSorting(int[] arr){

     int n = arr.length;
     if(n % 2 ==1){
         return;
     }
     int mid = n / 2;
     int[] l = new int[mid];
     int[] r = new int[n - mid];

      for (int i = 0; i < mid; i++) {
          l[i] = arr[i];
      }

      for (int i = 0; i < n - mid ; i++) {
          r[i] = arr[i + mid];
      }

      mergeSorting(l);
      mergeSorting(r);
      merge(arr, l, r);
   }

   private static void merge(int[] arr, int[] l, int[] r){
     int left = l.length;
     int right = r.length;
     int i = 0;
     int j = 0;
     int idx = 0;

     while(i < left && j < right){
         if(l[i] < r[j]){
             arr[idx] = l[i];
             i++;
         }else{
             arr[idx] = r[j];
             j++;
         }
         idx++;

     }

     for(int ll = i; ll < left; ll++){
         arr[idx++] = l[ll];
     }

       for (int rr = j; rr < right ; rr++) {
           arr[idx++] = r[rr];
       }
   }
  }



