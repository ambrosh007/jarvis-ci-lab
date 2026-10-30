public class BreakContinue {

    public static void main(String[] args) {

        for(int i = 1; i<=10;i++){
            if(i==4){
                System.out.println("Skipping this test case " + i);
                continue;
            }
            if(i==8){
                System.out.println("80 percent pass");
                break;
            }
            System.out.println("Executing test case number " + i);
        }





    }
}
