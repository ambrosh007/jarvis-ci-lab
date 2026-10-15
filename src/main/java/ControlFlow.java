public class ControlFlow {

    public static void main(String[] args) {

        int experience = 91;
        int requiredExperience = 10;
        boolean knowsJava = false;

        if(experience >= requiredExperience) {

            if(knowsJava){
                System.out.println("Candidate selected");
            }
            else{
                System.out.println("Candidate have exp but does not know Java");
            }

        }else{

            System.out.println("Exp is less");
        }



    }
}
