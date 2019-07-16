package secret.a.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int random = (int)(Math.random() * 20 + 1);
    public void Guesss(View view){

        EditText et=(EditText)findViewById(R.id.et);
        String s=et.getText().toString();
        int entered=Integer.parseInt(s);

        if(entered==random)
        {
            Toast.makeText(getApplicationContext(),"correct!!" ,Toast.LENGTH_SHORT).show();
            random=(int)(Math.random() * 20 + 1);
        }
        else if(entered>random)
        {
            Toast.makeText(getApplicationContext(),"High!!" ,Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Low!!" ,Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
