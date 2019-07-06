package android.example.currencyconapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button usdbtn,eurbtn,yenbtn,cadbtn,audbtn,zarbtn,clearbtn;
    boolean oper=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text =findViewById(R.id.edit);
        usdbtn =findViewById(R.id.dollar);
        eurbtn =findViewById(R.id.eur);
        yenbtn =findViewById(R.id.yen);
        cadbtn =findViewById(R.id.cad);
        audbtn =findViewById(R.id.aud);
        zarbtn =findViewById(R.id.zar);
        clearbtn =findViewById(R.id.clear);

        usdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length()==0 ) {
                    Toast.makeText(getApplicationContext(),"First enter the amount",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (oper == true) {
                        Double amount = Double.parseDouble(text.getText() + "");
                        amount *= 0.014;
                        text.setText(amount + "");
                        oper=false;
                    }
                }

            }
        });

        eurbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "First enter the amount", Toast.LENGTH_SHORT).show();
                } else {
                    if (oper == true) {
                        Double amount = Double.parseDouble(text.getText() + "");
                        amount *= 0.0127;
                        text.setText(amount + "");
                        oper=false;
                    }
                }
            }
        });

        yenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "First enter the amount", Toast.LENGTH_SHORT).show();
                } else {
                    if (oper == true) {
                        Double amount = Double.parseDouble(text.getText() + "");
                        amount *= 1.564;
                        text.setText(amount + "");
                        oper=false;
                    }
                }
            }
        });

        cadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "First enter the amount", Toast.LENGTH_SHORT).show();
                } else {
                    if(oper==true){
                    Double amount = Double.parseDouble(text.getText() + "");
                    amount *= 0.019;
                    text.setText(amount + "");
                    oper=false;
                }
                }
            }
        });

        audbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "First enter the amount", Toast.LENGTH_SHORT).show();
                } else {
                    if (oper == true) {
                        Double amount = Double.parseDouble(text.getText() + "");
                        amount *= 0.021;
                        text.setText(amount + "");
                        oper=false;
                    }
                }
            }
        });

        zarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "First enter the amount", Toast.LENGTH_SHORT).show();
                } else {
                    if (oper == true) {
                        Double amount = Double.parseDouble(text.getText() + "");
                        amount *= 0.22;
                        text.setText(amount + "");
                        oper=false;
                    }
                }
            }
        });




        clearbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                reset();
                oper=true;
             }
         });



    }
    private void reset(){
        text.setText(null);
    }
}
