/*
 *     This file is a part of SenseKit (https://github.com/danieltefera08/SenseKit)
 *     Copyright (C) 2024 Daniel Tefera Birhanu (danielteferabirhanu@gmail.com)
 *
 *     SenseKit is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     SenseKit is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with SenseKit.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.github.danieltefera08.sensekit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.github.danieltefera08.sensekit.ui.screens.NavScreen
import com.github.danieltefera08.sensekit.ui.theme.SenseKitTheme

//Todo : Add splash screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO : enable edge to edge
        enableEdgeToEdge()
        setContent {

            // TODO : Add dark theme switch
            SenseKitTheme( darkTheme = false ) {
                NavScreen()
            }
        }

    }


}
