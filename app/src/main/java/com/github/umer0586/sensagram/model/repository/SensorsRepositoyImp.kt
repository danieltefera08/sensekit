package com.github.danieltefera08.sensekit.model.repository

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import com.github.danieltefera08.sensekit.model.data.DeviceSensor
import com.github.danieltefera08.sensekit.model.data.toDeviceSensors

class SensorsRepositoryImp(private val context: Context) : SensorsRepository {

    override fun getAllSensors(): List<DeviceSensor> {
        val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        return sensorManager.getSensorList(Sensor.TYPE_ALL).filter{ it.reportingMode != Sensor.REPORTING_MODE_ONE_SHOT}.toDeviceSensors()
    }

}