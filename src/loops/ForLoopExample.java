package loops;

public class ForLoopExample {



public static int k =0;
    public static void main(String[] args) {

        int a[] = {1,2,3,556,5667,7};

        int n =10;
        for (int i=0;i<=n ;i++){
            System.out.println(i);
        }
        int j = 0;
      while (j<=10){
          System.out.println(j);
          j++;
      }

         System.out.println("Do while");
      do{
          k++;
          System.out.println(k);
      }while (k<=10);

    }


}
