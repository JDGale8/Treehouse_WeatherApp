package dallas.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Jake on 10/24/2015.
 */
public class AlertDialogFragment extends DialogFragment {

    // We have a member method that will create a dialog box
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // The AlertDialog.Builder requires some context, so we pass getActivity() to let it use the activity the box is made in
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.error_ok_button_text), null);
        // Create the alert dialog defined in the AlertDialogFragment class
        AlertDialog dialog = builder.create();

        return dialog;
    }
}