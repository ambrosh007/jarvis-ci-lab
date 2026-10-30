public class Loops {

    public static void main(String[] args) {

        for(int i = 2 ; i<=10 ;i=i+2){

            System.out.println("Even numbers " + " " + i);
        }
        System.out.println("-----------------");
       int i = 1 ;
        while(i<=5){
            System.out.println("Executing test" + " " + i);
            i++;
        }


        int a  = 1;

       do{
           System.out.println("Running automation test " + a);
           a++;
       }while(a<=4);


       for(int j =1 ; j<=10 ; j++){

           if(j%2==0){
               System.out.println("Test :" + j + "PASS");
           }else {
               System.out.println("Test :" + j + "FAIL");
           }
       }




    }
}
