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
package com.example.androiddevchallenge.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.ButtonDefaults.elevation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Screen
import com.example.androiddevchallenge.util.TODODescription

@Composable
fun BoxScope.Login(navController: NavController) {
    val isLight = MaterialTheme.colors.isLight
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (isLight) Color.White else MaterialTheme.colors.background)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(324.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_login_bg),
                contentDescription = TODODescription,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize(),
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Welcome", style = MaterialTheme.typography.h2, color = Color.White)
                Text(text = "back", style = MaterialTheme.typography.h2, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        InputLayout(icon = Icons.Filled.MailOutline, label = "Email address")
        Spacer(modifier = Modifier.height(8.dp))
        InputLayout(icon = Icons.Filled.Password, label = "Password")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.Home.route) },
            modifier = Modifier
                .height(48.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = MaterialTheme.shapes.large,
            colors = buttonColors(),
            elevation = elevation(defaultElevation = 0.dp, pressedElevation = 2.dp)
        ) {
            Text("LOG IN", style = MaterialTheme.typography.button)
        }
    }
}

@Composable
fun InputLayout(icon: ImageVector, label: String) {
    TextField(
        value = "",
        onValueChange = { /*TODO*/ },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = TODODescription,
            )
        },
        placeholder = {
            Text(text = label, style = MaterialTheme.typography.body1)
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 16.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onPrimary,
                shape = MaterialTheme.shapes.small
            ),
        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Unspecified)
    )
}
