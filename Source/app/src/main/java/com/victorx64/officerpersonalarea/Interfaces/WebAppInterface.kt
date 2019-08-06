package com.victorx64.officerpersonalarea.Interfaces

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(private val mContext: Context) {


    /** Show a toast from the web page  */
    @JavascriptInterface

    fun showToast(idTokenFromFirebase: String) {
        val firebaseIdToken = idTokenFromFirebase

    }

//    fun showToast (mContext: Context) {
//        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
//    }

}

//class WebAppInterface2(val idTokenFromFirebase: String) {
//
//    @JavascriptInterface
//
//    fun saveIdToken(idTokenFromFirebase: String) {
//        return idTokenFromFirebase
//    }
//
//}