package sg.edu.rp.c346.id19031965.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText numPax;
    Button svs;
    Button gst;
    EditText discountAmt;
    Button split;
    Button reset;
    TextView totalAmt;
    TextView amtEach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.amountText);
        numPax = findViewById(R.id.numPax);
        svs = findViewById(R.id.svs);
        gst = findViewById(R.id.gst);
        discountAmt = findViewById(R.id.editInputDiscount);
        split = findViewById(R.id.split);
        reset = findViewById(R.id.reset);
        totalAmt = findViewById(R.id.total);
        amtEach = findViewById(R.id.each);

        reset.setOnClickListener(new View.onClickListener() {
            @Override
                public void onClick(View v) {

                amount.setText("");
                numPax.setText("");
                svs.setChecked(false);

            }
        }


        if (amount.getText().toString().trim().length() != 0 && numPax.getText().toString().trim().length() != 0) {
            double newAmt = 0.0;
            if (!svs.isChecked() && !gst.isChecked()) {
                newAmt = Double.parseDouble(amount.getText().toString());
            } else if (svs.isChecked() && !gst.isChecked()) {
                newAmt = Double.parseDouble(amount.getText().toString()) * 1.1;
            }
        }q
    }
}