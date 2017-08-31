package br.eti.fernandosecastro.baratoneh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText edtNome,edtEmailRegistro,edtSenhaRegistro;
    Button btnCancelar,btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtNome = (EditText)findViewById(R.id.edtNomeRegistro);
        edtEmailRegistro = (EditText)findViewById(R.id.edtEmailRegistro);
        edtSenhaRegistro = (EditText)findViewById(R.id.edtSenhaRegistro);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
