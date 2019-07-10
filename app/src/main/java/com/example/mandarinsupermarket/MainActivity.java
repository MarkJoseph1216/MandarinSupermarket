package com.example.mandarinsupermarket;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSettings, btnOrder, btnExit;
    Dialog dialogExit;
    Button btnExitApp, btnCancelApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btnSettings = (Button) findViewById(R.id.btnSettings);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        btnExit = (Button) findViewById(R.id.btnExit);

        dialogExit = new Dialog(MainActivity.this);

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessageExit();
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void showMessageExit(){
        dialogExit.setContentView(R.layout.message_exit);

        btnExitApp = (Button) dialogExit.findViewById(R.id.btnExit);
        btnCancelApp = (Button) dialogExit.findViewById(R.id.btnCancel);

        btnCancelApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogExit.dismiss();
            }
        });

        btnExitApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        dialogExit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogExit.setCanceledOnTouchOutside(false);
        dialogExit.show();
    }

    @Override
    public void onBackPressed() {
        showMessageExit();
    }
}
