package com.example.user.lab7;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by user on 2015/11/25.
 */
public class Google extends Activity{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(false);

        Bundle b = getIntent().getExtras();
        webView.loadUrl(b.getString("url"));

        setContentView(webView, new ActionBar.LayoutParams(FP, WC));
    }
}
