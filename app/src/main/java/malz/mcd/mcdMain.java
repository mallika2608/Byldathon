package malz.mcd;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class mcdMain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd_main);

        Typeface gothamNarrowMedium = Typeface.createFromAsset(getAssets(), "GothamNarrow-Medium.ttf");
        TextView memberlogin = (TextView) findViewById(R.id.memberlogin);
        memberlogin.setTypeface(gothamNarrowMedium);
        memberlogin.setText("Member Login");


        Button mcdloginsubmit=(Button) findViewById(R.id.mcdloginsubmit);
        //mcdloginsubmit.setTextColor(0xffffff);
        mcdloginsubmit.setTypeface(gothamNarrowMedium);
        mcdloginsubmit.setText("GO");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mcd_main, menu);
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
