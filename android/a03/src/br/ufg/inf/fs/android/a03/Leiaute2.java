package br.ufg.inf.fs.android.a03;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Leiaute2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Leiaute2.this, ((Button)view).getText().toString(), Toast.LENGTH_LONG);
                toast.show();
            }
        };

        ViewGroup l = (ViewGroup) getLayoutInflater().inflate(R.layout.layout2, null);
        int filhos = l.getChildCount();
        Log.e("total de filhos", "" + filhos);

        Button b24 = (Button)findViewById(R.id.b24);
        b24.setOnClickListener(listener);

        for (int i = 0; i < filhos; i++) {
            View v = l.getChildAt(i);
            if (v instanceof Button) {
                v.setOnClickListener(listener);
                Button b = (Button)v;
                Log.e(b.getText().toString(), " tratado");
            }
        }
    }
}