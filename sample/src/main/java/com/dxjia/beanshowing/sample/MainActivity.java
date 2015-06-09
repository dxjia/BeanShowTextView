package com.dxjia.beanshowing.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.dxjia.beanshowing.R;
import com.dxjia.beanshowing.library.BeanShowingTextView;

public class MainActivity extends Activity {

    private Button mButton;

    private BeanShowingTextView mBeanShowTextView;

    private int index = 0;

    private String mTestStr1 = "This is a test string! Inflate the menu, and what happend?";
    private String mTestStr2 = "short word";
    private String mTestStr3 = "【杭州解除暴雨黄色预警信号】受梅雨带影响，前两天杭州出现暴雨。目前强雨带南压，影响趋于减弱。";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.change_text);

        mBeanShowTextView = (BeanShowingTextView) findViewById(R.id.bean_test);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 0) {
                    mBeanShowTextView.setText(mTestStr1);
                } else if(index == 1) {
                    mBeanShowTextView.setText(mTestStr2);
                } else if(index == 2) {
                    mBeanShowTextView.setText(mTestStr3);
                }
                index++;
                if (index > 2) {
                    index = 0;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
