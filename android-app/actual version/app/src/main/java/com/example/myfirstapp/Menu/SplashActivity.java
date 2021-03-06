package com.example.myfirstapp.Menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.example.myfirstapp.LogAndReg.LoginAct;
import com.example.myfirstapp.LogAndReg.RegActivity;
import com.example.myfirstapp.R;

public class SplashActivity extends Activity {
    TextView tv;

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash_screen);


        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashActivity.this, LoginAct.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
        TextView tv = (TextView) findViewById(R.id.tv);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        tv.startAnimation(animation);
    }
}