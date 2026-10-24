public class switchLesson {

    public static void main(String[] args) {

        String browser = "chrome";

        switch (browser){

            case "chrome" :
                System.out.println("Launch Chrome");
                break;

            case "firefox":
                System.out.println("Launch Firefox");
                break;

            case"Edge":
                System.out.println("Launch Edge");
                break;

            default:
                System.out.println("Browser not supported");
        }


    }
}
