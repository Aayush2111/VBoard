package com.example.vboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

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
    public void pdfupload(View view) {UserProfile.redirectActivity(this, upload.class); }
    public void ClickDashboard(View view) {
        UserProfile.redirectActivity(this, Dashboard.class);


    }
    public void ClickAboutUs(View view) {
        recreate();

    }
    public void ClickLogout(View view) {
        UserProfile.logout(this);

    }
    @Override
    protected void onPause() {
        super.onPause();
        UserProfile.closeDrawer(drawerLayout);
    }


}