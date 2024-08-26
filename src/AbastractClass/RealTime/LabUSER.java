package AbastractClass.RealTime;

public class LabUSER {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");

        FIREFOX F=new FIREFOX();
        F.openBrowser("FF");
        F.closeBrowser("FF");
    }
}
