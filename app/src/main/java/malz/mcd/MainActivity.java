package malz.mcd;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button forMCD=(Button) findViewById(R.id.forMCD);
        Typeface gothamNarrowMedium = Typeface.createFromAsset(getAssets(), "GothamNarrow-Medium.ttf");
        forMCD.setText("I work with the MCD");
        forMCD.setTypeface(gothamNarrowMedium);

        Button forpublic=(Button) findViewById(R.id.forpublic);
        forpublic.setText("I'm a normal human");
        forpublic.setTypeface(gothamNarrowMedium);
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

    public void goToMCD(View view)
    {
        Intent intent = new Intent(this, mcdMain.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void loadCitizen(View view)
    {
        Intent citizenIntent = new Intent(this, CitizenForm.class);
        startActivity(citizenIntent);
    }
}
