package AbastractClass.RealTime;

public class Chrome extends Baseclass{
    @Override
    String openBrowser(String browser) {
        System.out.println("open the chrome....");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("closing the chrome....");
        //This is code related to chrome only.
        return "";
    }
}
