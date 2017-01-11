package com.example.songyanjun.tapbar;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
    private Bundle mbundle = new Bundle();
    private FragmentTabHost mtabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragement);

        mtabhost = (FragmentTabHost)findViewById(R.id.tabhost);
        mtabhost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);

        mtabhost.addTab(getTabView(R.string.firstbottom,R.drawable.tab_first_selector),FirstActivity.class,mbundle);
        mtabhost.addTab(getTabView(R.string.secondbottom,R.drawable.tab_second_selector),SecondActivity.class,mbundle);
        mtabhost.addTab(getTabView(R.string.thirdbottom,R.drawable.tab_third_selector),ThirdActivity.class,mbundle);
        mtabhost.addTab(getTabView(R.string.forthbottom,R.drawable.tab_first_selector),ForthActivity.class,mbundle);

        mtabhost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);


    }

    private TabHost.TabSpec getTabView(int textId, int imgId) {
        String text = getResources().getString(textId);
        Drawable drawable = getResources().getDrawable(imgId);

        drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        View tabbar_view = getLayoutInflater().inflate(R.layout.tabbar_view,null);
        TextView tv_item = (TextView)tabbar_view.findViewById(R.id.tv_item);

        tv_item.setText(text);
        tv_item.setCompoundDrawables(null,drawable,null,null);
        TabHost.TabSpec spec = mtabhost.newTabSpec(text).setIndicator(tabbar_view);
        return spec;




    }




}
