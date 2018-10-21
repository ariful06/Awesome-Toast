package com.fendonus.awesometoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AwesomeToast {

    public static void simpleToast(Context context, String message, int textColor, int bgColor){
        Toast toast =  Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View toastView = toast.getView();
        TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
        toastMessage.setText(message);
        toastMessage.setTextSize(22);
        toastMessage.setTextColor(context.getResources().getColor(textColor));
        toastMessage.setGravity(Gravity.CENTER);
        toastMessage.setCompoundDrawablePadding(16);
        toastView.setBackgroundColor(context.getResources().getColor(bgColor));
        toast.show();
    }

    public static void awesomeToast(Context context,String message, int bgColor,int textColor,int icon){
        View v; // Creating an instance for View Object
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.toast_layout, null);

        LinearLayout toastLayout = v.findViewById(R.id.toast_layout);
        TextView toastMessage = v.findViewById(R.id.toast_message);
        ImageView imageView = v.findViewById(R.id.toast_icon);
        toastMessage.setText(message);
        toastMessage.setTextColor(context.getResources().getColor(textColor));
        toastLayout.setBackgroundColor(context.getResources().getColor(bgColor));
        toastMessage.setGravity(Gravity.CENTER);
        imageView.setImageDrawable(context.getResources().getDrawable(icon));
    }


}
