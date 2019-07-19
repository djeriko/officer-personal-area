package com.victorx64.officerpersonalarea

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.healthyworker.DoctorsFragment
import com.example.healthyworker.MyIsslFragment
import com.example.healthyworker.NotKnownFragment
import com.example.healthyworker.ProfileFragment

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> { NotKnownFragment() }
            1 -> { MyIsslFragment() }
            2 -> { DoctorsFragment() }
           else -> { ProfileFragment() }
        }
    }
    override fun getCount(): Int {
        return  4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "NotKnown"
            1 -> "Мои Исследования"
            2 -> "Врачи"
            else -> {return "Мой Кабинет"}
        }
    }
}