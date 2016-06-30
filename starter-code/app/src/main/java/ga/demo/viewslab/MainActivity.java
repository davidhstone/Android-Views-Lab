package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView mTextView1;
    TextView mTextView2;
    Button mButton;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mButton10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Put your Java code in here
        mTextView1 = (TextView) findViewById(R.id.textview_1);
        mTextView2 = (TextView) findViewById(R.id.textview_2);
        mButton = (Button) findViewById(R.id.button_click_me);
        mButton2 = (Button) findViewById(R.id.button_click_me2);
        mButton3 = (Button) findViewById(R.id.button_click_me3);
        mButton4 = (Button) findViewById(R.id.button_click_me4);
        mButton5 = (Button) findViewById(R.id.button_click_me5);
        mButton6 = (Button) findViewById(R.id.button_click_me6);
        mButton7 = (Button) findViewById(R.id.button_click_me7);
        mButton8 = (Button) findViewById(R.id.button_click_me8);
        mButton9 = (Button) findViewById(R.id.button_click_me9);
        mButton10 = (Button) findViewById(R.id.button_click_me10);



       // mButton.setHint("Your favorite animal");

        View.OnClickListener clicklistener = new View.OnClickListener() {
            @Override
                public void onClick (View view){
                    if (view instanceof Button) {
                        Toast.makeText(view.getContext(), "You clicked the button!", Toast.LENGTH_LONG).show();
                    }
                }
        };
        mButton.setOnClickListener(clicklistener);
        mButton2.setOnClickListener(clicklistener);
        mButton3.setOnClickListener(clicklistener);
        mButton4.setOnClickListener(clicklistener);
        mButton5.setOnClickListener(clicklistener);
        mButton6.setOnClickListener(clicklistener);
        mButton7.setOnClickListener(clicklistener);
        mButton8.setOnClickListener(clicklistener);
        mButton9.setOnClickListener(clicklistener);
        mButton10.setOnClickListener(clicklistener);
    }
}

/*View.OnClickListener clicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view instanceof Button) {
                    Toast.makeText(view.getContext(), "You clicked the button!", Toast.LENGTH_LONG).show();*/