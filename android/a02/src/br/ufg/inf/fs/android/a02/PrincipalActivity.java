package br.ufg.inf.fs.android.a02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PrincipalActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.vaiParaAtividade2) {
            Intent intent = new Intent(this, SegundaActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.vaiParaAtividade3) {
            Intent intent = new Intent(this, TerceiraActivity.class);
            startActivity(intent);
            return true;
        }  else if (id == R.id.fecharPrimeira) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }
}
