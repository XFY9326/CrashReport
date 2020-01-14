# CrashReport
Report Crash Log By Email

------------------
- Using Method:

      //Only Can Use In Application Method
      @Override
      public void onCreate ()
      {
          // TODO: Implement this method
          super.onCreate();
          CrashHandler crashHandler = CrashHandler.getInstance();
          crashHandler.init(this, "File Selector","test.xfy9326.fileselector.MainActivity", "xfy9326@126.com");
          //Context AppName MainActivity EmailAddress
      }
