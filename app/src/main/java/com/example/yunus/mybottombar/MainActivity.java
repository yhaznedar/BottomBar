package com.example.yunus.mybottombar;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;


public class MainActivity extends AppCompatActivity {
    private BottomBar mBottomBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView);
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.bottombar_menu);


        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId)
            {// The user selected the tab.
                if (menuItemId  == R.id.bb_menu_arac)
                {
                   textView.setText("Araçlarım sekmesindesiniz.");
                }
                if (menuItemId  == R.id.bb_menu_yakin)
                {
                    textView.setText("Yakınımdakiler sekmesindesiniz.");
                }
                if (menuItemId  == R.id.bb_menu_yaklasan)
                {
                    textView.setText("Yaklaşanlar sekmesindesiniz.");
                }
                if (menuItemId  == R.id.bb_menu_ipuc)
                {
                    textView.setText("İpuçları sekmesindesiniz.");
                }

            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId)
            {
                    // The user reselected tab. React accordingly.

                if (menuItemId  == R.id.bb_menu_arac)
                {
                    textView.setText("Araçlarım sekmesindesiniz.");
                }
                if (menuItemId  == R.id.bb_menu_yakin)
                {
                    textView.setText("Yakınımdakiler sekmesindesiniz.");
                }
                if (menuItemId  == R.id.bb_menu_yaklasan)
                {
                    textView.setText("Yaklaşanlar sekmesindesiniz.");
                }
                if (menuItemId  == R.id.bb_menu_ipuc)
                {
                    textView.setText("İpuçları sekmesindesiniz.");
                }

            }
        });




    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mBottomBar.onSaveInstanceState(outState);

    }
}
