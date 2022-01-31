package com.aim.aplicacionhabla

import android.content.Context
import com.robotemi.sdk.Robot
import com.robotemi.sdk.listeners.OnGoToLocationStatusChangedListener


class Movimiento(val context: Context, val robot: Robot) {
private var robotint: Robot ?= null
  private val listenerGoToLocationStatus = object : OnGoToLocationStatusChangedListener{
      override fun onGoToLocationStatusChanged(
          location: String,
          status: String,
          descriptionId: Int,
          description: String
      ) {
          TODO("Not yet implemented")
      }

  }
    init {
        if(robot!= null)
            robotint = robot
        else
            robotint = Robot.getInstance()

    }

}