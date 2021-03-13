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
package com.example.androiddevchallenge.data

/**
 * 储存了所有 UI 屏幕的数据
 * Store all UI screen data.
 *
 * @author 凛 (https://github.com/RinOrz)
 */
sealed class Screen(val route: String) {
    object Welcome : Screen("Welcome")
    object Login : Screen("Login")
    object Home : Screen("Home")
    object Positions : Screen("Positions")
}
