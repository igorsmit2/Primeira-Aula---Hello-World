package br.com.igor.usjt.olamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView mensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);

        mensagemTextView = findViewById(R.id.mensagemTextView);

        Intent origemIntent = getIntent();
        String msg = origemIntent.getStringExtra("mensagem");

        mensagemTextView.setText(msg);
    }
}
