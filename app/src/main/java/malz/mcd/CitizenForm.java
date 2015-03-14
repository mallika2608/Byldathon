package malz.mcd;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class CitizenForm extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_form);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_citizen_form, menu);
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

    static final int REQUEST_IMAGE_CAPTURE = 1;
    static final Uri mLocationForPhotos = null;
    public void clickPicture(View view){
        Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
        }
    }

    public void sendReport(View button){
        final EditText EditTextName = (EditText) findViewById(R.id.EditTextName);
        String name = EditTextName.getText().toString();

       /* final EditText EditTextEmail = (EditText) findViewById(R.id.EditTextEmail);
        String email = EditTextEmail.getText().toString(); */

        final EditText EditTextFeedbackBody = (EditText) findViewById(R.id.EditTextFeedbackBody);
        String feedback = EditTextFeedbackBody.getText().toString();

        final Spinner feedbackSpinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
        String feedbackType = feedbackSpinner.getSelectedItem().toString();

        Intent mEmail = new Intent(Intent.ACTION_SEND);
        mEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ "bhavna13029@iiitd.ac.in"});
//        mEmail.putExtra(Intent.EXTRA_USER, new String(email));
        mEmail.putExtra(Intent.EXTRA_SUBJECT, "["+feedbackType+"]" + " Public Grievance");
        mEmail.putExtra(Intent.EXTRA_TEXT, feedback + "\n\nFrom: "+name);
// prompts to choose email client
        mEmail.setType("message/rfc822");
        startActivity(Intent.createChooser(mEmail, "Choose an email client to send"));
        finish();
    }
}
