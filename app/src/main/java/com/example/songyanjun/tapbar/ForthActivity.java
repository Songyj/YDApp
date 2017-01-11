package com.example.songyanjun.tapbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by songyanjun on 2016/12/12.
 */

public class ForthActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
       return inflater.inflate(R.layout.activity_forth,container,false);
    }
}
