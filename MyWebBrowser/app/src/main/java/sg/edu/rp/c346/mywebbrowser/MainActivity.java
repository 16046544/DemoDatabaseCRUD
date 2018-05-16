package sg.edu.rp.c346.mywebbrowser;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etURL;
    Button btnLoadURL;
    WebView wvMyPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etURL = (EditText)findViewById(R.id.editTextUrl);
        btnLoadURL = (Button)findViewById(R.id.buttonLoad);
        wvMyPage = (WebView)findViewById(R.id.webViewClient);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);
            }
        });
    }
}
