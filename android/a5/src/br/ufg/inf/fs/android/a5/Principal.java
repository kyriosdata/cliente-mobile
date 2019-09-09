package br.ufg.inf.fs.android.a5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends Activity {

    private static final String CONTADOR = "contador";

    /**
     * Empregado para contar as rotações.
     */
    private int contador = 0;

    /**
     * Método chamado quando a Activity é criada.
     * Observe que isto pode ocorrer quando se rotaciona
     * a tela.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Caso não seja null, obtenha o valor do contador.
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt(CONTADOR);
        }

        // Exiba o valor inicial ou recuperado (do contador)
        TextView view = (TextView)findViewById(R.id.contadorView);
        view.setText("" + contador);

        // Toda vez que se rotaciona a tela, o contador é incrementado.
        contador++;
    }

    /**
     * Persiste o valor do contador de tal forma que ele possa ser
     * recuperado na próxima chamada a onCreate (veja acima).
     * @param outState Estado no qual o valor do contador
     *                 será persistido.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(CONTADOR, contador);

        super.onSaveInstanceState(outState);
    }
}
