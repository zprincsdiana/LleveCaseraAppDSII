package com.anys.lleve_casera_dv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginMercado extends AppCompatActivity {

    Button btn_log_vendedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mercado);

        btn_log_vendedor = findViewById(R.id.btn_login_v);
        btn_log_vendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginMercado.this, PrincipalVendedor.class));
                finish();
            }
        });
    }
}