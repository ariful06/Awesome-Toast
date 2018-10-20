package com.fendonus.awesometoast;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AwesomeToast {
    public static void simpleToast(Context context, String message,int color){
        Toast toast =  Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View toastView = toast.getView();
        TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
        toastMessage.setText(message);
        toastMessage.setTextSize(22);
        toastMessage.setTextColor(context.getResources().getColor(color));
        toastMessage.setGravity(Gravity.CENTER);
        toastMessage.setCompoundDrawablePadding(16);
        toastView.setBackgroundColor(Color.CYAN);
        toast.show();
    }

}
