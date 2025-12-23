package com.github.danieltefera08.sensekit.data.repository

import com.github.danieltefera08.sensekit.data.model.DeviceSensor

interface SensorsRepository {
    fun getAllSensors(): List<DeviceSensor>
}