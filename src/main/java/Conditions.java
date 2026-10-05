public class Conditions {

    public static void main(String[] args) {

        int experience = 14;
        int requiredExperience = 10;

        boolean expAsPerRole = experience > requiredExperience; // true
        boolean notFitForRole = experience<requiredExperience; // false
       boolean fitForRole =  experience >= requiredExperience;// true
      boolean rejectedForForRole =   experience <= requiredExperience; // false
        boolean okForJob = experience == requiredExperience; // false
      boolean notShotListed =  experience != requiredExperience; //true

        boolean knowsJava = true;
        boolean knowsSelenium = true;
        boolean knowsPlaywright = false;

        boolean eligibleForInterview;
        boolean hasAutomationSkill;
         boolean  needsJavaTraining;

         eligibleForInterview = experience >= requiredExperience  && knowsJava;
         hasAutomationSkill = knowsSelenium || knowsPlaywright;
         needsJavaTraining = !knowsJava;

        boolean strongCandidate = experience > requiredExperience && knowsJava && (knowsSelenium||knowsPlaywright);

    }
}
