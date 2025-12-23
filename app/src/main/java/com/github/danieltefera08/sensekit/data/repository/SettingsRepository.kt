package com.github.danieltefera08.sensekit.data.repository

import com.github.danieltefera08.sensekit.data.model.Setting
import kotlinx.coroutines.flow.Flow


interface SettingsRepository {
    suspend fun saveSetting(setting: Setting)
    val setting : Flow<Setting>
}

