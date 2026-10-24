public class EnhancedSwitch {

    public static void main(String[] args) {

        String browser  = "chrome";
        String browserType = switch (browser){

            case "chrome" ,"edge" -> "Chromium";
            case "firefox" -> "Gecko";
            default ->  "Unknown";

        };
        System.out.println(browserType);
    }
}
