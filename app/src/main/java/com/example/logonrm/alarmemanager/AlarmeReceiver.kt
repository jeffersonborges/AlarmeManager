package com.example.logonrm.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class AlarmeReceiver: BroadcastReceiver(){

    private  var mp: MediaPlayer? = null

    override fun onReceive(context: Context?, intent: Intent?) {
        mp = MediaPlayer.create(context, R.raw.alarme)
        mp!!.start()
        Toast.makeText(context, "Alarm...", Toast.LENGTH_LONG).show()
    }

}