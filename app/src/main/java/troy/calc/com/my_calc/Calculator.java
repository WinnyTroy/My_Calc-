package troy.calc.com.my_calc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    EditText   editText1,editText2;
    Button b_plus, b_minus, b_div, b_multi;
    TextView textView;

    double num1, num2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        b_plus = (Button) findViewById(R.id.b_plus);
        b_minus = (Button) findViewById(R.id.b_minus);
        b_multi = (Button) findViewById(R.id.b_multi);
        b_div = (Button) findViewById(R.id.b_div);

        textView = (TextView) findViewById(R.id.textView);

        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText1.getText().toString().equals("") || !editText2.getText().toString().equals("")){
                    num1 = Double.parseDouble(editText1.getText().toString());
                    num2 = Double.parseDouble(editText2.getText().toString());

                    result =num1 + num2;

                    textView.setText(" " +  result);
                }
            }
        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText1.getText().toString().equals("") || !editText2.getText().toString().equals("")){
                    num1 = Double.parseDouble(editText1.getText().toString());
                    num2 = Double.parseDouble(editText2.getText().toString());

                    result =num1 - num2;

                    textView.setText(" " +  result);
                }

            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText1.getText().toString().equals("") || !editText2.getText().toString().equals("")){
                    num1 = Double.parseDouble(editText1.getText().toString());
                    num2 = Double.parseDouble(editText2.getText().toString());

                    result =num1 * num2;

                    textView.setText(" " +  result);
                }

            }
        });

        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText1.getText().toString().equals("") || !editText2.getText().toString().equals("")){
                    num1 = Double.parseDouble(editText1.getText().toString());
                    num2 = Double.parseDouble(editText2.getText().toString());

                    result =num1 / num2;

                    textView.setText(" " +  result);
                }

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Share this App on Whatsapp!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
