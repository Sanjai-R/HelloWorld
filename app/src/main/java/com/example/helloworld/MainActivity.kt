package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.InputChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(
                                10.dp
                            )
                            .fillMaxWidth()
                    ) {
                        var fname by remember {
                            mutableStateOf("")
                        }
                        var lname by remember {
                            mutableStateOf("")
                        }
                        var email by remember {
                            mutableStateOf("")
                        }
                        var password by remember {
                            mutableStateOf("")
                        }
                        var modifierFull= Modifier.fillMaxWidth()
                        var modifierHalf = Modifier.weight(1f)
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Text("Sign Up ", textAlign = TextAlign.Start, fontSize = 30.sp, fontWeight = FontWeight.W700)
                            Text("It's Quick and easy")
                        }
                        Divider()
                        Row(horizontalArrangement = Arrangement.spacedBy(5.dp), modifier = Modifier.fillMaxWidth()) {
                            TextField(value = fname, onValueChange = { fname = it },modifier = modifierHalf, placeholder = {
                                Text(text = "Fullname")
                            })
                            TextField(value = lname, onValueChange = { lname = it },modifier = modifierHalf, placeholder = {
                                Text(text = "Last Name")
                            })
                        }
                        TextField(value = email, onValueChange = { email = it }, modifier = modifierFull , placeholder = {
                            Text(text = "Mobile number or Email Address")
                        })
                        TextField(visualTransformation = PasswordVisualTransformation(),value = password, onValueChange = { password = it }, modifier = modifierFull, placeholder = {
                            Text(text = "Password")
                        } )
                        Text("People who use our service may have uploaded your contact information to Facebook",textAlign = TextAlign.Start, modifier = modifierFull)
                        
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(20),
                            modifier = Modifier.size(250.dp, height =50.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xff00A401))
                        ) {
                            Text(text = "Sign Up", color = Color.White, fontSize = 20.sp )
                        }
                    }
                }
            }
        }
    }
}

