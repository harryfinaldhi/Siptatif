package com.example.siptatif

import android.annotation.SuppressLint
import android.graphics.Paint.Style
import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.siptatif.ui.theme.SiptatifTheme
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)){
                    Column(modifier = Modifier) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(bottom = 16.dp)
                        ){
                            //foto Profile
                        Image(painter = painterResource(id = R.drawable.p12250113594), contentDescription ="p12250113594", modifier = Modifier
                            .size(100.dp)
                            .padding(16.dp)
                            .clip(shape = CircleShape)
                        )
                            //Nama dan email
                            Column (
                                modifier = Modifier
                                    .padding(start = 16.dp)

                            ) {

                        Text(
                            text = "HARRY FINALDHI",

                        )
                            Text(
                                text = "12250113594@student.uin-suska.ac.id",
                            )
                            }
                        }

                    }

                }
                Divider()
                NavigationDrawerItem(label = { Text(text = "Home") },
                    selected = false ,
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "home") },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Home.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(label = { Text(text = "DataMahasiswa") },
                    selected = false ,
                    icon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "datamahasiswa") },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.DataMahasiswa.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(label = { Text(text = "Dosen") },
                    selected = false ,
                    icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "dosen") },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Dosen.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(label = { Text(text = "Logout") },
                    selected = false ,
                    icon = { Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "logout") },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        Toast.makeText(context, "Logout", Toast.LENGTH_SHORT).show()
                    })
            }
        },
        ) {
        Scaffold(
            topBar = {
                val coroutineScope = rememberCoroutineScope()
                TopAppBar(title = { Text(text = "SIPTATIF")},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Green,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                Icons.Rounded.Menu, contentDescription = "MenuButton")

                        }
                    })
            }
        ) {
            NavHost(navController = navigationController, startDestination = Screens.Home.screen){
                composable(Screens.Home.screen){ Home()}
                composable(Screens.DataMahasiswa.screen){ DataMahasiswa()  }
                composable(Screens.Dosen.screen){ Dosen() }
            }
        }

    }
}

@Preview
@Composable
fun mainPreview() {
    SiptatifTheme {
        MainScreen()
    }
    
}

