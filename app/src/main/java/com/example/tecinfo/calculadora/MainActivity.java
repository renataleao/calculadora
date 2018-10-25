
package com.example.tecinfo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String memoria;
    private String operacao;
    private Double valor1 = 0;
    private Double valor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView displayConta = (TextView) findViewById(R.id.displayConta);
        final TextView displayResultado = (TextView) findViewById(R.id.displayResultado);

        final Button btn0 = (Button)findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnapagar = (Button) findViewById(R.id.btn_apagar);
        final Button btnmultiplicacao = (Button) findViewById(R.id.btn_multiplicacao);
        final Button btndivisao = (Button) findViewById(R.id.btn_divisao);
        final Button btnsubtracao = (Button) findViewById(R.id.btn_subtracao);
        final Button btnsoma = (Button) findViewById(R.id.btn_soma);
        final Button btnigual = (Button) findViewById(R.id.btn_igual);
        final Button btnvirgula = (Button) findViewById(R.id.btn_virgula);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "1");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "9");
            }
        });

        btnvirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + ",");
            }
        });

        btnapagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = "";
                displayConta.setText("");
                displayResultado.setText("");
            }
        });

        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "+";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString() + "+");
                displayConta.setText("");
            }
        });

        btnsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "-";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString() + "-");
                displayConta.setText("");
            }
        });

        btnmultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "*";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString() + "*");
                displayConta.setText("");
            }
        });

        btndivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "/";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString() + "/");
                displayConta.setText("");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (displayConta.getText().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Digite um número", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
