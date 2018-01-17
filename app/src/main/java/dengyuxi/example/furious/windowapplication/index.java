package dengyuxi.example.furious.windowapplication;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Created by Lenovo on 2017/12/13.
 */
public class index extends Activity{
    Button loginbutton = null;
    Button clockbtn = null;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.index);

        clockbtn = (Button)findViewById(R.id.index_clock);
        clockbtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(index.this,clock.class);
            }
        });
        loginbutton = (Button)findViewById(R.id.loginbtn);
        loginbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(index.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }


}
