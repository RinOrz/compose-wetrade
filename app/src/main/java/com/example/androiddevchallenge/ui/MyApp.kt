/*
 * Copyright 2021-2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Screen
import com.example.androiddevchallenge.ui.home.Home
import com.example.androiddevchallenge.ui.login.Login
import com.example.androiddevchallenge.ui.positions.Positions
import com.example.androiddevchallenge.ui.welcome.Welcome
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

/**
 * Kitty App 的 UI 唯一入口点
 * The only UI entry point for the Kitty App.
 *
 * @author 凛 (https://github.com/RinOrz)
 */
@Composable
fun MyApp() {
    val navController = rememberNavController()

    ProvideWindowInsets {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
        ) {
            NavHost(navController, startDestination = Screen.Welcome.route) {
                composable(Screen.Welcome.route) { Welcome(navController) }
                composable(Screen.Login.route) { Login(navController) }
                composable(Screen.Home.route) { Home(navController) }
                composable(Screen.Positions.route) { Positions(navController) }
            }
        }
    }
}
