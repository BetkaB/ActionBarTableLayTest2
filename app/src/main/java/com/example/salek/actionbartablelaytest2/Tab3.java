package com.example.salek.actionbartablelaytest2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by salek on 11-Sep-15.
 */
public class Tab3 extends Fragment{
    View mViewRoot;
Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewRoot =inflater.inflate(R.layout.tab_3_moje, container, false);
        mContext = mViewRoot.getContext();
        klikni();

        return mViewRoot;
    }

private void klikni (){

    Button btnMoje = (Button) mViewRoot.findViewById(R.id.mojeButtom);
    btnMoje.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "TLACITKO Test toastu vole:-D", Toast.LENGTH_SHORT).show();
        }
    });

    CheckBox ccmoje = (CheckBox)mViewRoot.findViewById(R.id.mojeCheckbutom);
    ccmoje.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            Toast.makeText(mContext, "CHECKBOX CHECKEDCHANGE Test toastu vole:-D", Toast.LENGTH_SHORT).show();
        }
    });














}

}
