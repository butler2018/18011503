package com.example.student.a18011503;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickWrite(View v)
    {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        EditText ed = (EditText)findViewById(R.id.editText);
        editor.putString("data1",ed.getText().toString());
        editor.commit();
    }
    public void clickRead(View v)
    {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        String str = sp.getString("data1","");
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(str);
    }
    public void clickSetting(View v)
    {
     Intent it = new Intent(this,SettingsActivity.class);
     startActivity(it);

    }

    public void click3(View v)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String str = sp.getString("example_text","");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(str);


    }


}
