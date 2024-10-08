package br.com.fabriciocurvello.appcalculadoracimatecjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero1;
    private EditText etNumero2;
    private Spinner spOperacao;
    private Button btCalcular;
    private TextView tvResultado;

    private Calculadora calculadora = new Calculadora();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNumero1 = findViewById(R.id.et_numero1);
        etNumero2 = findViewById(R.id.et_numero2);
        spOperacao = findViewById(R.id.sp_operacao);
        btCalcular = findViewById(R.id.bt_calcular);
        tvResultado = findViewById(R.id.tv_resultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = null, num2 = null;
                try  {
                    num1 = Double.parseDouble(etNumero1.getText().toString());
                    num2 = Double.parseDouble(etNumero2.getText().toString());
                } catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show();
                } finally {
                    String operacao = spOperacao.getSelectedItem().toString();

                    if ((num1 != null) && (num2 != null)) {
                        Double resultado = calculadora.calcular(num1, num2, operacao);
                        tvResultado.setText(String.valueOf(resultado));
                    } else {
                        tvResultado.setText(String.valueOf("Entrada inválida."));
                    }
                }
            }
        });
    }
}