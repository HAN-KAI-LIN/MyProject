package com.example.user.lab7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by user on 2015/11/25.
 */
public class WebViewExample extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharSequence[] list = new CharSequence[2];
        list[0]="Goolge";
        list[1]="input url";

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(
                this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent();
                Bundle b = new Bundle();

                if(position == 0){
                    b.putString("url", "http://www.google.com.tw/");
                    i.putExtras(b);
                    i.setClass(WebViewExample.this, Google.class);
                }
                if (position == 1){
                    i.setClass(WebViewExample.this, MainActivity.class);
                }
                startActivity(i);
            }

        });
    }
}
