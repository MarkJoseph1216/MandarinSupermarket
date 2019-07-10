package com.example.mandarinsupermarket;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderActivity extends AppCompatActivity {


    Dialog dialogOrderCode;
    Button btnCancel, btnOkay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        dialogOrderCode = new Dialog(OrderActivity.this);

        showOrderCode();

    }

    private void showOrderCode(){
        dialogOrderCode.setContentView(R.layout.order_code);
        btnCancel = (Button) dialogOrderCode.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialogOrderCode.findViewById(R.id.btnOkay);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        dialogOrderCode.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogOrderCode.setCanceledOnTouchOutside(false);
        dialogOrderCode.show();
    }
}
