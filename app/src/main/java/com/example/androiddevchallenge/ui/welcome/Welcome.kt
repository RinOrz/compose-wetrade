/*
 * Copyright 2021 The Android Open Source Project
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
package com.example.androiddevchallenge.ui.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.ButtonDefaults.textButtonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Screen
import com.example.androiddevchallenge.util.TODODescription

@Composable
fun BoxScope.Welcome(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.ic_welcome_bg),
        contentDescription = TODODescription,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Image(
        painter = painterResource(id = R.drawable.ic_logo),
        contentDescription = TODODescription,
        modifier = Modifier.align(Alignment.Center)
    )
    Row(
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(horizontal = 16.dp)
            .padding(bottom = 32.dp)
    ) {
        Button(
            onClick = { navController.navigate(Screen.Login.route) },
            modifier = Modifier
                .height(48.dp)
                .weight(1f),
            shape = MaterialTheme.shapes.large,
            colors = buttonColors(),
            elevation = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 2.dp)
        ) {
            Text("GET STARTED", style = MaterialTheme.typography.button)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            onClick = { navController.navigate(Screen.Login.route) },
            modifier = Modifier
                .height(48.dp)
                .weight(1f),
            shape = MaterialTheme.shapes.large,
            border = BorderStroke(1.dp, MaterialTheme.colors.primary),
            colors = textButtonColors(),
            elevation = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 2.dp)
        ) {
            Text("LOG IN", style = MaterialTheme.typography.button)
        }
    }
}
