package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclear,bequal;
    TextView result;
    float valone,valsec;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);
        b4 = (Button)findViewById(R.id.btn4);
        b5 = (Button)findViewById(R.id.btn5);
        b6 = (Button)findViewById(R.id.btn6);
        b7 = (Button)findViewById(R.id.btn7);
        b8 = (Button)findViewById(R.id.btn8);
        b9 = (Button)findViewById(R.id.btn9);
        b0 = (Button)findViewById(R.id.btn0);
        badd = (Button)findViewById(R.id.btnadd);
        bmul = (Button)findViewById(R.id.btnmul);
        bsub = (Button)findViewById(R.id.btnsub);
        bdiv = (Button)findViewById(R.id.btndiv);
        bclear = (Button)findViewById(R.id.clear);
        bequal = (Button)findViewById(R.id.equals);
        result = (TextView)findViewById(R.id.res);

        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(result.getText()+"0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(result  == null)
                {
                    result.setText(result.getText()+ "");
                }
                else
                {
                    valone = Float.parseFloat(result.getText()+"");
                    add = true;
                    result.setText(null);
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(result  == null)
                {
                    result.setText(result.getText()+ "");
                }
                else
                {
                    valone = Float.parseFloat(result.getText()+"");
                    sub = true;
                    result.setText(null);
                }
            }
        });


        bmul.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(result  == null)
                {
                    result.setText(result.getText()+ "");
                }
                else
                {
                    valone = Float.parseFloat(result.getText()+"");
                    mul = true;
                    result.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(result  == null)
                {
                    result.setText(result.getText()+ "");
                }
                else
                {
                    valone = Float.parseFloat(result.getText()+"");
                    div = true;
                   result.setText(null);
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                valsec = Float.parseFloat(result.getText()+"");
                if(add == true)
                {
                    result.setText(valone + valsec + "");
                    add = false;
                }
                if(sub == true)
                {
                    result.setText(valone - valsec + "");
                    sub = false;
                }
                if(mul == true)
                {
                    result.setText(valone * valsec+"");
                    mul = false;
                }
                if(div == true)
                {
                    result.setText(valone /valsec +"");
                    div = false;
                }

            }
        });
        bclear.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                result.setText(null);
            }
        });
    }
}
