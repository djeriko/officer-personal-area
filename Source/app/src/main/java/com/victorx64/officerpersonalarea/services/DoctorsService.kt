package com.victorx64.officerpersonalarea.services

import com.victorx64.officerpersonalarea.models.Doctors
import retrofit2.Call
import retrofit2.http.GET

interface DoctorsService {

    @GET("doctors")
    fun getDoctorsList(): Call<List<Doctors>>
}