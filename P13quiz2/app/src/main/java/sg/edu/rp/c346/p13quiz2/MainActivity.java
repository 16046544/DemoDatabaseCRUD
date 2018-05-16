package sg.edu.rp.c346.p13quiz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnURL;
    WebView wvMyPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnURL = (Button)findViewById(R.id.buttonURL);
        wvMyPage = (WebView)findViewById(R.id.webViewClient);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.Bing.com";
                wvMyPage.loadUrl(url);
            }
        });
    }
}
