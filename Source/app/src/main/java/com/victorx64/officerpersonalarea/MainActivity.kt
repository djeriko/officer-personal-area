package com.victorx64.officerpersonalarea

import android.app.ActionBar
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.healthyworker.DoctorsFragment
import com.example.healthyworker.MyResearcheslFragment
import com.example.healthyworker.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private  val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.my_researches -> {
                replaceFragment(MyResearcheslFragment())

            }
            R.id.my_doctors -> {
                replaceFragment(DoctorsFragment())

            }
            else -> {
                replaceFragment(ProfileFragment())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(MyResearcheslFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private fun replaceFragment(fragment : Fragment): Boolean {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    return true }
}

