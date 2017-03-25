package br.ufg.inf.fs.android.atividade;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Atividade que tem como finalidade ilustrar, por meio de registros de log,
 * os estados pelos quais uma atividade passa ao longo do seu ciclo de
 * vida.
 */
public class Principal extends Activity {
    /**
     * Chamado quando o aplicativo é iniciado pelo usuário.
     *
     * <p>Aqui deve conter código a ser executado exatamente
     * uma única vez pelo CicloDeVida da atividade. Ou seja,
     * após a execução deste método, uma nova chamada só irá
     * ocorrer se a atividade for recriada.</p>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.w("CicloDeVida", "onCreate - Principal ==> CREATED");
        setContentView(R.layout.main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.w("CicloDeVida", "onStart - Principal ==> STARTED");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w("CicloDeVida", "onResume - Principal ==> RESUMED");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.w("CicloDeVida", "onPause - Principal ==> PAUSED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.w("CicloDeVida", "onRestart - Principal ==> Will call onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.w("CicloDeVida", "onStop - Principal ==> STOPPED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.w("CicloDeVida", "onDestroy - Principal ==> DESTROYED");
    }
}
