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
package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Screen
import com.example.androiddevchallenge.ui.theme.customGreen
import com.example.androiddevchallenge.util.TODODescription
import dev.chrisbanes.accompanist.insets.navigationBarsHeight
import dev.chrisbanes.accompanist.insets.statusBarsHeight

@Composable
fun Home(navController: NavHostController) {
    Column {
        Spacer(modifier = Modifier.statusBarsHeight())
        Row(
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "ACCOUNT",
                style = MaterialTheme.typography.button,
                modifier = Modifier.weight(1f),
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Text(
                text = "WATCHLIST",
                style = MaterialTheme.typography.button,
                modifier = Modifier.weight(1f),
                color = Color.White.copy(alpha = 0.6f),
                textAlign = TextAlign.Center,
            )
            Text(
                text = "PROFILE",
                style = MaterialTheme.typography.button,
                modifier = Modifier.weight(1f),
                color = Color.White.copy(alpha = 0.6f),
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Balance",
            modifier = Modifier
                .height(32.dp)
                .paddingFromBaseline(32.dp)
                .align(Alignment.CenterHorizontally),
            color = Color.White,
            style = MaterialTheme.typography.subtitle1
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "\$73,589.01",
            modifier = Modifier
                .height(48.dp)
                .align(Alignment.CenterHorizontally),
            color = Color.White,
            style = MaterialTheme.typography.h1
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "+412.35 today",
            modifier = Modifier
                .height(16.dp)
                .align(Alignment.CenterHorizontally),
            color = customGreen,
            style = MaterialTheme.typography.subtitle1
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = MaterialTheme.shapes.large,
            colors = ButtonDefaults.buttonColors(),
        ) {
            Text("Transact", style = MaterialTheme.typography.button)
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(modifier = Modifier.padding(horizontal = 16.dp)) {
            items(listOf("Week", "ETFs", "Stocks", "Funds", "More")) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    shape = MaterialTheme.shapes.large,
                    border = BorderStroke(1.dp, Color.White),
                    colors = ButtonDefaults.textButtonColors(contentColor = Color.White),
                    elevation = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 0.dp)
                ) {
                    Text(it, style = MaterialTheme.typography.body1)
                    if (it == "Week") {
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Filled.ExpandMore,
                            contentDescription = TODODescription,
                            Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.ic_home_illos),
            contentDescription = TODODescription,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(16.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(16.dp))
        val draggableState = rememberDraggableState {
            if (it < 320) navController.navigate(Screen.Positions.route)
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth()
                .background(Color.White)
                .draggable(draggableState, Orientation.Vertical)
        ) {
            Text("Positions", style = MaterialTheme.typography.subtitle1)
        }
        Spacer(
            modifier = Modifier
                .navigationBarsHeight()
                .background(Color.White)
                .fillMaxWidth()
        )
    }
}
