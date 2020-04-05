package com.covid_19indiatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class aboutMe extends AppCompatActivity {
Button knowThem,myGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        knowThem=findViewById(R.id.knowThem);
        myGit=findViewById(R.id.myGit);

    }

    public void knowThem(View v){
        Toast.makeText(this, "Opening https://www.covid19india.org/faq ", Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(aboutMe.this,covidIndFaq.class));
        String url = "https://www.covid19india.org/faq";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setPackage("com.android.chrome");
        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            // Chrome is probably not installed
            // Try with the default browser
            i.setPackage(null);
            startActivity(i);
        }
    }

    public void myGit(View v){
        Toast.makeText(this, "Opening Github of Silent_Coder ", Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(aboutMe.this,covidIndFaq.class));
        String url = "https://github.com/Silentxknight";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setPackage("com.android.chrome");
        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            // Chrome is probably not installed
            // Try with the default browser
            i.setPackage(null);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(aboutMe.this,MainActivity.class));
    }
}
