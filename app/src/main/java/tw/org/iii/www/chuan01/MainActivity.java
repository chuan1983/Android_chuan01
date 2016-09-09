package tw.org.iii.www.chuan01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnclick;
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick = (Button) findViewById(R.id.btnclick);
        mesg = (TextView) findViewById(R.id.mesg);

        btnclick.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mesg.setText("樂透號碼:"+(int)(Math.random()*49+1));
            }
        });

    }
}
