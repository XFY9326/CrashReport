package test.xfy9326.crashreport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        dataset();
    }

    private void dataset ()
    {
        Button select = (Button) findViewById(R.id.selectbutton);
        select.setOnClickListener(new OnClickListener(){
                public void onClick (View v)
                {
                    throw new Error();
                }
            });
    }
}
