package com.example.familysafetyapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar);
        bottomBar.setOnItemSelectedListener {

            if(it.itemId==R.id.nav_guard)
            {

                inflateFragement(GuardFragement.newInstance())

            }else if(it.itemId == R.id.nav_home)
        {

                inflateFragement(HomeFragment.newInstance());
        }
            else if(it.itemId == R.id.nav_dashboard)
            {
                inflateFragement(DashboardFragment.newInstance())

            }

            else
            {
                inflateFragement(ProfileFragment.newInstance())
            }


            true;
        }
    }



    private fun inflateFragement(newInstance: Fragment)
    {
        val transanction = supportFragmentManager.beginTransaction();
        transanction.replace(R.id.container, newInstance)
        transanction.commit();


    }

}










