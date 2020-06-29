package com.example.ergocheck.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.ergocheck.R;


public class Splash extends Activity {
<<<<<<< HEAD


=======
>>>>>>> version2
    private static int SPLASH_TIME_OUT = 2500;
    LinearLayout iconLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD

=======
>>>>>>> version2
        if (!isTaskRoot()) {
            finish();
            return;
        }
<<<<<<< HEAD

=======
>>>>>>> version2
        setContentView(R.layout.splash);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (!isTaskRoot()
                && getIntent().hasCategory(Intent.CATEGORY_LAUNCHER)
                && getIntent().getAction() != null
                && getIntent().getAction().equals(Intent.ACTION_MAIN)) {
<<<<<<< HEAD

            finish();
            return;
        }








        iconLayout = (LinearLayout) findViewById(R.id.iconLayout);
        iconLayout.clearAnimation();



        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
         iconLayout.setVisibility(View.VISIBLE);

    new Handler().postDelayed(new Runnable() {
=======
            finish();
            return;
        }
        iconLayout = (LinearLayout) findViewById(R.id.iconLayout);
        iconLayout.clearAnimation();
        iconLayout.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
>>>>>>> version2

            /*
             * Showing Splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
<<<<<<< HEAD

                    Intent i = new Intent(Splash.this, MainActivity.class);
                    startActivity(i);
                    finish();
            }
        }, SPLASH_TIME_OUT);
    }



}


=======
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
>>>>>>> version2
