package com.example.mandarinsupermarket;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    Dialog dialog;
    TextInputEditText edtIPAddress, edtPort, edtOrderDatabase, edtDatabaseName, edtUsername, edtPassword;

    Button btnCancel, btnOkay, btnSave;
    TextInputEditText edtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        edtIPAddress = (TextInputEditText) findViewById(R.id.edtIPAddress);
        edtPort = (TextInputEditText) findViewById(R.id.edtPort);
        edtOrderDatabase = (TextInputEditText) findViewById(R.id.edtOrderDatabase);
        edtDatabaseName = (TextInputEditText) findViewById(R.id.edtDatabaseName);
        edtUsername = (TextInputEditText) findViewById(R.id.edtUsername);
        edtPassword = (TextInputEditText) findViewById(R.id.edtPassword);

        btnSave = (Button) findViewById(R.id.btnSaveSettings);

        dialog = new Dialog(SettingsActivity.this);

        edtIPAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showIPAddressDialog();
            }
        });
        edtPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPortDialog();
            }
        });
        edtOrderDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOrderDatabaseDialog();
            }
        });
        edtDatabaseName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatabaseNameDialog();
            }
        });
        edtUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUsernameDialog();
            }
        });
        edtPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPasswordDialog();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ipAddress = edtIPAddress.getText().toString();
                String port = edtPort.getText().toString();
                String orderDatabase = edtOrderDatabase.getText().toString();
                String databaseName = edtDatabaseName.getText().toString();
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();



            }
        });
    }

    private void showIPAddressDialog(){
        dialog.setContentView(R.layout.layout_ipaddress);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialog.findViewById(R.id.btnOkay);
        edtInput = (TextInputEditText) dialog.findViewById(R.id.edtInput);

        edtInput.setHint("IP Address");

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textInput = edtInput.getText().toString();
                edtIPAddress.setText(textInput);
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    private void showPortDialog() {
        dialog.setContentView(R.layout.layout_ipaddress);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialog.findViewById(R.id.btnOkay);
        edtInput = (TextInputEditText) dialog.findViewById(R.id.edtInput);

        edtInput.setHint("Port");

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textInput = edtInput.getText().toString();
                edtPort.setText(textInput);
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    private void showOrderDatabaseDialog() {
        dialog.setContentView(R.layout.layout_ipaddress);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialog.findViewById(R.id.btnOkay);
        edtInput = (TextInputEditText) dialog.findViewById(R.id.edtInput);

        edtInput.setHint("Order Database");

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textInput = edtInput.getText().toString();
                edtOrderDatabase.setText(textInput);
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    private void showDatabaseNameDialog() {
        dialog.setContentView(R.layout.layout_ipaddress);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialog.findViewById(R.id.btnOkay);
        edtInput = (TextInputEditText) dialog.findViewById(R.id.edtInput);

        edtInput.setHint("Database Name");

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textInput = edtInput.getText().toString();
                edtDatabaseName.setText(textInput);
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }
    private void showUsernameDialog() {
        dialog.setContentView(R.layout.layout_ipaddress);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialog.findViewById(R.id.btnOkay);
        edtInput = (TextInputEditText) dialog.findViewById(R.id.edtInput);

        edtInput.setHint("Username");

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textInput = edtInput.getText().toString();
                edtUsername.setText(textInput);
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }
    private void showPasswordDialog() {
        dialog.setContentView(R.layout.layout_ipaddress);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);
        btnOkay = (Button) dialog.findViewById(R.id.btnOkay);
        edtInput = (TextInputEditText) dialog.findViewById(R.id.edtInput);

        edtInput.setHint("Password");

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textInput = edtInput.getText().toString();
                edtPassword.setText(textInput);
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }
}
