package com.example.xu.sendemail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.xander.sendemaillib.SendEmail;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button btn;
    private android.widget.RelativeLayout activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activitymain = (RelativeLayout) findViewById(R.id.activity_main);
        this.btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        String[] strings ={"596928539@qq.com","596928539@qq.com"};
                        SendEmail.send(strings,"c2222rash","哈哈哈，没有崩溃，逗你呢" );
                    }
                }.start();
            }
        });
  }
}
