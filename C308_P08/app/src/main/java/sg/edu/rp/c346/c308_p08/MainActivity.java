package sg.edu.rp.c346.c308_p08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        myWebView = (WebView)findViewById(R.id.webview1);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        //myWebView.loadUrl("https://www.smartnation.sg");
        //myWebView.loadUrl("file:///android_asset/index.html");
        myWebView.loadUrl("http://10.0.2.2/c308_p08_snowflake/index.html");

        myWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed()
    {
        if(myWebView.canGoBack())
            myWebView.goBack();
        else
            super.onBackPressed();
    }
}
