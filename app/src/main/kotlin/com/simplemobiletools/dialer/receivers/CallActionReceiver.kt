package com.simplemobiletools.dialer.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.simplemobiletools.dialer.activities.CallActivity
import com.simplemobiletools.dialer.helpers.ACCEPT_CALL
import com.simplemobiletools.dialer.helpers.CallManager
import com.simplemobiletools.dialer.helpers.DECLINE_CALL

class CallActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            ACCEPT_CALL -> {
                Log.d("CallActionReceiver", "User answered the call.")
                context.startActivity(CallActivity.getStartIntent(context))
                CallManager.accept()
            }
            DECLINE_CALL -> {
                Log.d("CallActionReceiver", "User declined the call.") // Log when the call is declined
                CallManager.reject()
            }else -> {
                Log.w("CallActionReceiver", "Unknown action received: ${intent.action}") // Log unexpected actions
            }
        }
    }
}
