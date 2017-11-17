package com.android.kickstart.dialog;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Custom progress dialog used while calling API & disable the user interaction to the app.
 */
public class MyProgressDialog extends ProgressDialog {

    private static final String TAG = "MyProgressDialog";

    public MyProgressDialog(Context context, String message, boolean isCancelable) {
        super(context);
        this.setMessage(message);
        this.setCancelable(isCancelable);
        this.setCanceledOnTouchOutside(false);
    }
}
