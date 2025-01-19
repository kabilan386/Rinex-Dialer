package com.simplemobiletools.dialer.models

data class CallStatusRequest(
    val agent_number: String,
    val contact: String,
    val method: String
)

data class CallStatusResponse(
    val status: String,
    val message: String,
    val data: List<Any>?
)
