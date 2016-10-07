package test.xfy9326.crashreport;
import android.app.Application;
import lib.xfy9326.crashreport.CrashHandler;

public class App extends Application
{
    @Override
    public void onCreate ()
    {
        // TODO: Implement this method
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this, "File Selector","test.xfy9326.fileselector.MainActivity", "xfy9326@126.com");
    }
}
