package br.eti.fernandosecastro.baratoneh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.nio.file.Files;

public class LoginActivity extends AppCompatActivity {
    EditText txtEmail,txtSenha;
    TextView txtRegistro;
    Button btnLogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        txtEmail = (EditText)findViewById(R.id.edtLogin);
        txtSenha = (EditText)findViewById(R.id.edtSenha);
        btnLogar = (Button)findViewById(R.id.btnLogin);
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreMain = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(abreMain);

            }
        });
        txtRegistro = (TextView)findViewById(R.id.txtRegistro);
        txtRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreCadastro = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(abreCadastro);

            }
        });
    }
}
