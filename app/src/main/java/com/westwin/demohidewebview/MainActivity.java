package com.westwin.demohidewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebViewTop;
    private WebView mWebViewHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebViewTop = (WebView) findViewById(R.id.webViewTop);
        mWebViewTop.getSettings().setJavaScriptEnabled(true);
        mWebViewTop.loadUrl("http://cn.bing.com");
        mWebViewTop.bringToFront();

        mWebViewHide = (WebView) findViewById(R.id.webViewHide);
        mWebViewHide.getSettings().setJavaScriptEnabled(true);
        mWebViewHide.loadUrl("http://www.guancha.cn");
    }
}
