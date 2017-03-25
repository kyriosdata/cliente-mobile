package br.ufg.inf.fs.android.a03;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by fabio_000 on 22/04/2014.
 */
public class Leiaute1 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl("http://www.inf.ufg.br");
    }
}