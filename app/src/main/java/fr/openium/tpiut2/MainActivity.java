package fr.openium.tpiut2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);
        String aaaaaa = getApplicationContext().getString(R.string.AAAAAAAAA);
        textView.setText(aaaaaa);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = editText.getText().toString();
                Toast.makeText(getApplicationContext(), content, Toast.LENGTH_LONG).show();
            }
        });
    }
}