package com.example.app.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView display;

    Button factorial, power, root, pie, cancel;
    Button sin, xSquare, xCube, e, back;
    Button cos, seven, eight, nine, divide;
    Button tan, four, five, six, mul;
    Button ln, one, two, three, minus;
    Button log, zero, dot, equal, plus;

    double result = 0;
    double num1 = 0;

    String displayText;

    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);

        initializeViews();
        setEventsForViews();
    }


    private void initializeViews() {
        display = (TextView) findViewById(R.id.display);

        factorial = (Button) findViewById(R.id.factorial);
        power = (Button) findViewById(R.id.power);
        root = (Button) findViewById(R.id.root);
        pie = (Button) findViewById(R.id.pie);
        cancel = (Button) findViewById(R.id.cancel);

        sin = (Button) findViewById(R.id.sin);
        xSquare = (Button) findViewById(R.id.x_square);
        xCube = (Button) findViewById(R.id.x_cube);
        e = (Button) findViewById(R.id.e);
        back = (Button) findViewById(R.id.back);

        cos = (Button) findViewById(R.id.cos);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        divide = (Button) findViewById(R.id.divide);

        tan = (Button) findViewById(R.id.tan);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        mul = (Button) findViewById(R.id.mul);

        ln = (Button) findViewById(R.id.ln);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        minus = (Button) findViewById(R.id.minus);

        log = (Button) findViewById(R.id.log);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        plus = (Button) findViewById(R.id.plus);
    }


    private void setEventsForViews() {
        factorial.setOnClickListener(this);
        power.setOnClickListener(this);
        root.setOnClickListener(this);
        pie.setOnClickListener(this);
        cancel.setOnClickListener(this);

        sin.setOnClickListener(this);
        xSquare.setOnClickListener(this);
        xCube.setOnClickListener(this);
        e.setOnClickListener(this);
        back.setOnClickListener(this);

        cos.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        divide.setOnClickListener(this);

        tan.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        mul.setOnClickListener(this);

        ln.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        minus.setOnClickListener(this);

        log.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.factorial:
                operator = '!';
                displayText = result + "!";
                display.setText(displayText);
                break;
            case R.id.power:
                operator = '^';
                displayText = result + "^";
                display.setText(displayText);
                num1 = result;
                result = 0;
                break;
            case R.id.root:
                num1 = 1;
                operator = 'r';
                displayText = "√";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "√";
                }
                display.setText(displayText);
                result = 0;
                break;
            case R.id.pie:
                num1 = 1;
                operator = 'p';
                displayText = "π";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "π";
                }
                display.setText(displayText);
                result = 0;
                break;
            case R.id.cancel:
                displayText = "";
                display.setText(displayText);
                result = 0;
                num1 = 0;
                break;


            case R.id.sin:
                operator = 's';
                num1 = 1;
                displayText = "sin";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "sin";
                }
                display.setText(displayText);
                result = 0;
                break;
            case R.id.x_square:
                result = result * result;
                display.setText(String.valueOf(result));

                break;
            case R.id.x_cube:
                result = result * result * result;
                display.setText(String.valueOf(result));
                break;
            case R.id.e: result = result * 2.14;
                display.setText(String.valueOf(result));
                break;
            case R.id.back:
                result = (int)(result / 10);
                display.setText(String.valueOf(result));
                break;

            case R.id.cos:
                num1 = 1;
                operator = 'c';
                displayText = "cos";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "cos";
                }
                result = 0;
                display.setText(displayText);
                break;
            case R.id.seven:
                result = (result * 10) + 7;
                display.setText(String.valueOf(result));
                break;
            case R.id.eight:
                result = (result * 10) + 8;
                display.setText(String.valueOf(result));
                break;
            case R.id.nine:
                result = (result * 10) + 9;
                display.setText(String.valueOf(result));
                break;
            case R.id.divide:
                operator = '/';
                num1 = result;
                result = 0.0;
                break;

            case R.id.tan:
                num1 = 1;
                operator = 't';
                displayText = "tan";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "tan";
                }
                display.setText(displayText);
                result = 0;
                break;
            case R.id.four:
                result = (result * 10) + 4;
                display.setText(String.valueOf(result));
                break;
            case R.id.five:
                result = (result * 10) + 5;
                display.setText(String.valueOf(result));
                break;
            case R.id.six:
                result = (result * 10) + 6;
                display.setText(String.valueOf(result));
                break;
            case R.id.mul:
                operator = '*';
                num1 = result;
                result = 0.0;
                break;

            case R.id.ln:
                num1 = 1;
                operator = 'n';
                displayText = "ln";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "ln";
                }
                display.setText(displayText);
                result = 0;
                break;
            case R.id.one:
                result = (result * 10) + 1;
                display.setText(String.valueOf(result));
                break;
            case R.id.two:
                result = (result * 10) + 2;
                display.setText(String.valueOf(result));
                break;
            case R.id.three:
                result = (result * 10) + 3;
                display.setText(String.valueOf(result));
                break;
            case R.id.minus:
                operator = '-';
                num1 = result;
                result = 0.0;
                break;

            case R.id.log:
                num1 = 1;
                operator = 'l';
                displayText = "sin";
                if (result != 0) {
                    num1 = result;
                    displayText = result + "sin";
                }
                display.setText(displayText);
                result = 0;
                break;
            case R.id.zero:
                result = (result * 10);
                display.setText(String.valueOf(result));
                break;
            case R.id.dot:
//                result = (result * 10) + 3;
//                display.setText(String.valueOf(result));
                break;
            case R.id.equal:
                result = findResult(num1, result, operator);
                display.setText(String.valueOf(result));
                result = 0;
                break;
            case R.id.plus:
                operator = '+';
                num1 = result;
                result = 0.0;
                break;
        }
    }

    private double findFactorial(int result) {

        double fact = 1;
        if (result == 0)
            return 1;
        else if (result > 0) {
            for (int i = 1; i <= result; i++)
                fact = fact * i;
        }
        Log.i("check", String.valueOf(fact));
        return fact;
    }

    private double findResult(double num1, double result, char operator) {

        switch (operator) {
            case '!':
                result = findFactorial((int) result);
                break;
            case '^':
                result = Math.pow(num1, result);
                break;
            case 'r':
                result = (num1 * Math.sqrt(result));
                break;
            case 'p':
                result = (num1 * 3.14159265358);
                break;

            case 's':
                result = (num1 * Math.sin(result));
                break;
            case 'c':
                result = (num1 * Math.cos(result));
                break;
            case 't':
                result = (num1 * Math.tan(result));
            case '/':
                if (result != 0) {
                    result = (num1 / result);
                }
                break;
            case 'n':
                result = (num1 * Math.log(result));
                break;
            case '-':
                result = (num1 - result);
                break;
            case 'l':
                result = (num1 * Math.log10(result));
                break;
            case '+':
                result = (num1 + result);
                break;
        }
        return result;
    }
}
