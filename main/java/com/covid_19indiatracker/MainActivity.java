package com.covid_19indiatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button visitWeb,rfbtn,abtMe;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.webView);
        visitWeb=findViewById(R.id.visiteWeb);
        rfbtn=findViewById(R.id.rfbtn);
        abtMe=findViewById(R.id.abtMe);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.covid19india.org/");
        WebSettings webSettings=webView.getSettings();
        webSettings.setAppCacheEnabled(true);
       webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);


    }

     public void refresh(View v){
         Toast.makeText(this, "Refreshing Site...", Toast.LENGTH_SHORT).show();
         webView.loadUrl("https://www.covid19india.org/");
    }
    public void visitWeb(View v){
        webView.loadUrl("https://www.covid19india.org/");

    }
    public void abtMe(View v){
        startActivity(new Intent(MainActivity.this,aboutMe.class));
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }

    }
}
