package com.simplemobiletools.dialer

import com.simplemobiletools.dialer.models.CallStatusRequest
import com.simplemobiletools.dialer.models.CallStatusResponse

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiService {
    @POST("Rinex_AI/api_startcall") // Replace with the actual endpoint path
    fun updateCallStatus(@Body callStatusRequest: CallStatusRequest): Call<CallStatusResponse>

    @POST("Rinex_AI/api_endcall") // Replace with the actual endpoint path
    fun updateCallEndStatus(@Body callStatusRequest: CallStatusRequest): Call<CallStatusResponse>
}
