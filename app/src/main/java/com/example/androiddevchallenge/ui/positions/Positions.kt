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
package com.example.androiddevchallenge.ui.positions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Position
import com.example.androiddevchallenge.ui.theme.customGreen
import com.example.androiddevchallenge.ui.theme.customRed
import com.example.androiddevchallenge.util.TODODescription
import dev.chrisbanes.accompanist.insets.statusBarsHeight

@Composable
fun Positions() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.statusBarsHeight())
        Text(
            text = "Positions",
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.Black,
            style = MaterialTheme.typography.subtitle1
        )
        LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
            items(
                listOf(
                    Position(
                        dollar = "\$7,918",
                        change = "-0.54%",
                        title = "ALK",
                        summary = "Alaska Air Group, Inc.",
                        chart = R.drawable.home_alk
                    ),
                    Position(
                        dollar = "\$1,293",
                        change = "+4.18%",
                        title = "BA",
                        summary = "Boeing Co.",
                        chart = R.drawable.home_ba
                    ),
                    Position(
                        dollar = "\$893.50",
                        change = "-0.54%",
                        title = "DAL",
                        summary = "Delta Airlines Inc.",
                        chart = R.drawable.home_dal
                    ),
                    Position(
                        dollar = "\$12,301",
                        change = "+2.51%",
                        title = "EXPE",
                        summary = "Expedia Group Inc.",
                        chart = R.drawable.home_exp
                    ),
                    Position(
                        dollar = "\$12,301",
                        change = "+1.38%",
                        title = "EADSY",
                        summary = "Airbus SE",
                        chart = R.drawable.home_eadsy
                    ),
                    Position(
                        dollar = "\$8,521",
                        change = "+1.56%",
                        title = "JBLU",
                        summary = "Jetblue Airways Corp.",
                        chart = R.drawable.home_jblu
                    ),
                    Position(
                        dollar = "\$521",
                        change = "+2.75%",
                        title = "MAR",
                        summary = "Marriott International Inc.",
                        chart = R.drawable.home_mar
                    ),
                    Position(
                        dollar = "+0.14%",
                        change = "\$5,481",
                        title = "CCL",
                        summary = "Carnival Corp",
                        chart = R.drawable.home_ccl
                    ),
                    Position(
                        dollar = "\$9,184",
                        change = "+1.69%",
                        title = "RCL",
                        summary = "Royal Caribbean Cruises",
                        chart = R.drawable.home_rcl
                    ),
                    Position(
                        dollar = "\$654",
                        change = "+3.23%",
                        title = "TRVL",
                        summary = "Travelocity Inc.",
                        chart = R.drawable.home_trvl
                    ),
                )
            ) {
                Column {
                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(MaterialTheme.colors.onSurface)
                    )
                    Row(modifier = Modifier.padding(vertical = 16.dp)) {
                        Column(modifier = Modifier.width(60.dp)) {
                            Text(
                                text = it.dollar,
                                style = MaterialTheme.typography.body1
                            )
                            Text(
                                text = it.change,
                                color = if (it.change.startsWith("+")) customGreen else customRed,
                                style = MaterialTheme.typography.body1
                            )
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = it.title,
                                style = MaterialTheme.typography.h3
                            )
                            Text(
                                text = it.summary,
                                color = if (it.change.startsWith("+")) customGreen else customRed,
                                style = MaterialTheme.typography.body1
                            )
                        }

                        Image(painter = painterResource(id = it.chart), contentDescription = TODODescription)
                    }
                }
            }
        }
    }
}
