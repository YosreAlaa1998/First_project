package com.example.first_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView input;
    TextView output;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,clr,plus,minuse,div,mul,dot,equal,mod;
    boolean operatorStrate;
    double num1, num2, result;
    String opp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        input=(TextView) findViewById(R.id.input);
        output=(TextView) findViewById(R.id.output);
        b0= (Button) findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString()!= "")
                    input.setText(input.getText().toString()+"0");
            }
        });
        b1= (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    input.setText(input.getText().toString()+"1");
            }
        });
        b2= (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"2");
            }
        });
        b3= (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"3");
            }
        });
        b4= (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"4");
            }
        });
        b5= (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"5");
            }
        });
        b6= (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"6");
            }
        });
        b7= (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"7");
            }
        });
        b8= (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"8");
            }
        });
        b9= (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"9");
            }
        });
        dot= (Button) findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+".");
            }
        });
        plus=(Button) findViewById(R.id.add);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operatorStrate) {
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    operatorStrate = true;
                    opp = "+"; } }});

        minuse=(Button) findViewById(R.id.sub);
        minuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operatorStrate) {
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    operatorStrate = true;
                    opp = "-"; } }});

        mul=(Button) findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operatorStrate) {
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    operatorStrate = true;
                    opp = "*"; } }});

        div=(Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operatorStrate) {
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    operatorStrate = true;
                    opp = "/"; } }});
        mod=(Button) findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!operatorStrate) {
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    operatorStrate = true;
                    opp = "%"; } }});



        clr=(Button) findViewById(R.id.clear);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                opp="";
                num1=0.0;
                num2=0.0;
                operatorStrate=false;
                output.setText("");
            }
        });

        equal= (Button) findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opp!= ""&& operatorStrate){
                    num2 = Double.parseDouble(input.getText().toString());
                    switch (opp){
                        case "+" :
                            result= num1+num2;
                            input.setText(num1+" + " + num2 + "= " );
                            output.setText(result+"");
                            break;
                        case "-" :
                            result= num1-num2;
                            input.setText(num1+" - " + num2+ "= " );
                            output.setText(result+"");
                            break;
                        case "*" :
                            result= num1*num2;
                            input.setText(num1+" * " + num2+ "= " );
                            output.setText(result+"");
                            break;
                        case "/" :
                            result= num1/num2;
                            input.setText(num1+" / " + num2+ "= " );
                            output.setText(result+"");
                            break;
                        case "%" :
                            result= num1%num2;
                            input.setText(num1+" % " + num2 + "= " );
                            output.setText(result+"");
                            break;

                    }
                }
            }
        });


    }
}
