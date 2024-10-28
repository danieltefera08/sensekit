package com.github.danieltefera08.sensekit.model.repository

import com.github.danieltefera08.sensekit.model.data.Setting
import kotlinx.coroutines.flow.Flow


interface SettingsRepository {
    suspend fun saveSetting(setting: Setting)
    val setting : Flow<Setting>
}

