package com.example.vboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Home_Page extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        drawerLayout = findViewById(R.id.drawer_layout);


    }
    public void ClickMenu(View view) {
        UserProfile.openDrawer(drawerLayout);

    }

    public void ClickLogo(View view){
        UserProfile.closeDrawer(drawerLayout);
    }
    public void ClickHome(View view) {
        UserProfile.redirectActivity(this, UserProfile.class);
    }
    public void ClickDashboard(View view) {
        recreate();

    }
    public void ClickAboutUs(View view) {
        UserProfile.redirectActivity(this, AboutUs.class);
    }
     public void ClickLogout(View view) {
         UserProfile.logout(this);

     }
     public void pdfupload(View view) {UserProfile.redirectActivity(this, upload.class);}
    @Override
    protected void onPause() {
        super.onPause();
        UserProfile.closeDrawer(drawerLayout);
    }



}