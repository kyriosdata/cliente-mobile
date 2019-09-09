package br.ufg.inf.fs.android.a01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Uma atividade herda de Activity.
 */
public class MyActivity extends Activity {

    /**
     * Chamado quando a atividade é criada. Uma atividade
     * contém uma ContentView, que é inflada conforme o
     * resource, neste caso, o arquivo main.xml
     * contido no diretório res\layout.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Observe o R (resource) abaixo. Ele corresponde ao
        // diretório "res". Neste diretório interessa o diretório
        // layout e, neste diretório, o arquivo main.xml. Tudo isto
        // é "deduzível" de R.layout.main.
        setContentView(R.layout.main);
    }

    /**
     * Chamado para "inflar" o recurso "menu" contendo
     * os itens do menu de opções.
     * @param menu Objeto a ser "inflado" com o resource fornecido.
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    /**
     * Chamado quando se seleciona a opção Configurar.
     * Neste caso, apenas exibe uma mensagem por um
     * período de tempo.
     * @param item Opção de menu selecionada.
     */
    public void onClickMenuConfigurar(MenuItem item) {
        Toast toast = Toast.makeText(this, "Configurar...", Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * Chamado quando se seleciona o item Sair.
     * Neste caso, termina a aplicação.
     * @param item
     */
    public void onClickMenuSair(MenuItem item) {
        finish();
    }

    /**
     * Chamado quando uma opção de menu é selecionada.
     * Observe, do código abaixo, as ações executadas:
     * (i) obter o identificador da opção selecionada;
     * (ii) conforme o identificador, chamar método que irá
     * tratar a seleção do usuário.
     * @param item
     * @return <c>true</c> se o item foi tratado, ou <c>false</c>
     * caso contrário.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_configurar:
                onClickMenuConfigurar(item);
                return true;

            case R.id.menu_sair:
                onClickMenuSair(item);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
