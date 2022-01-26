package com.aim.aplicacionhabla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robotemi.sdk.Robot

class MainActivity : AppCompatActivity() {
    private var robot: Robot?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        robot = Robot.getInstance()

    }
}