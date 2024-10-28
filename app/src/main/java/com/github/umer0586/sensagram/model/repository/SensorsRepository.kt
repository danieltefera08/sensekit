package com.github.danieltefera08.sensekit.model.repository

import com.github.danieltefera08.sensekit.model.data.DeviceSensor

interface SensorsRepository {
    fun getAllSensors(): List<DeviceSensor>
}