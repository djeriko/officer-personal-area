package com.victorx64.officerpersonalarea

import android.app.ActionBar
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.healthyworker.DoctorsFragment
import com.example.healthyworker.MyIsslFragment
import com.example.healthyworker.NotKnownFragment
import com.example.healthyworker.ProfileFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), DoctorsFragment.OnFragmentInteractionListener, MyIsslFragment.OnFragmentInteractionListener, NotKnownFragment.OnFragmentInteractionListener, ProfileFragment.OnFragmentInteractionListener, NavigationView.OnNavigationItemSelectedListener  {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        val id = p0.getItemId()
        var viewPager: ViewPager = findViewById(R.id.viewpager) as ViewPager
        when (id) {
            R.id.not_known -> {
                viewPager.currentItem = 0 }
            R.id.navigation_issl -> {
                viewPager.currentItem = 1 }
            R.id.navigation_notifications -> {
                viewPager.currentItem = 2 }
           R.id.navigation_profile -> {
               viewPager.currentItem = 3 }

        }
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var toolbar: ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
}
