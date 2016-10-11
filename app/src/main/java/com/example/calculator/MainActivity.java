package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one, two, three, four, five, six, seven, eight, nine, add, subtract, enter, divide, multiply, allclear;
    int sign;//0 for add, 1 for subtract, 2 for multiply, 3 for divide,
    private TextView test;
    private String[] numbers; //this is where all the numbers are stored
    int holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wire();
        calculate();
    }

    private void calculate() {
        holder = 0;

        test.setText("");
        numbers = new String[2];
        numbers[holder]="";
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numbers[holder]+=1;
                numbers[holder ]+="";
                test.setText(numbers[holder]);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=2;
                test.setText(numbers[holder]);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=3;
                test.setText(numbers[holder]);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=4;
                test.setText(numbers[holder]);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=5;
                test.setText(numbers[holder]);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=6;
                test.setText(numbers[holder]);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=7;
                test.setText(numbers[holder]);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=8;
                test.setText(numbers[holder]);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=9;
                test.setText(numbers[holder]);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder++;
                sign =1;
                test.setText("");
                numbers[holder] = "";

            }

        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder++;
                sign =2;
                test.setText("");
                numbers[holder] = "";

            }

        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder++;
                sign = 3;
                test.setText("");
                numbers[holder] = "";

            }

        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder++;
                sign =4;
                test.setText("");
                numbers[holder] = "";

            }

        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder = 0;
                int first = Integer.parseInt(numbers[0]);
                int second = Integer.parseInt(numbers[1]);
                if(sign ==1)
                {
                    int third = first + second;
                    test.setText(third+"");
                    numbers[holder] = third +"";

                }
                else if(sign ==2) {
                    int third = first - second;
                    test.setText(third + "");
                    numbers[holder] = third +"";
                }
                else if(sign ==3)
                {
                    int third = first/second;
                    test.setText(third + "");
                    numbers[holder] = third +"";
                }
                else if(sign ==4)
                {
                    int third = first*second;
                    test.setText(third + "");
                    numbers[holder] = third +"";
                }
            }
        });
        allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.setText("");
                holder =0;
                numbers[holder] = "";
                numbers[holder+1] = "";

            }
        });
    }

    private void wire() {
        one = (Button) findViewById(R.id.button_one);
        two = (Button) findViewById(R.id.button_two);
        add = (Button) findViewById(R.id.button_add);
        subtract = (Button) findViewById(R.id.button_subtract);
        enter = (Button) findViewById(R.id.button_enter);
        test = (TextView) findViewById(R.id.textView);
        three = (Button) findViewById(R.id.button_three);
        four = (Button) findViewById(R.id.button_four);
        five = (Button) findViewById(R.id.button_five);
        six = (Button) findViewById(R.id.button_six);
        seven = (Button) findViewById(R.id.button_seven);
        eight = (Button) findViewById(R.id.button_eight);
        nine = (Button) findViewById(R.id.button_nine);
        divide = (Button) findViewById(R.id.button_divide);
        multiply = (Button) findViewById(R.id.button_multiply);

        allclear = (Button) findViewById(R.id.button_ac);

    }
}



