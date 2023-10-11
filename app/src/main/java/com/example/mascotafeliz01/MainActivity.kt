package com.example.mascotafeliz01

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mascotafeliz01.ui.theme.MascotaFeliz01Theme

class MainActivity : ComponentActivity() {
}

@Composable
fun Elementos() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.perritolindo),
            contentDescription = "Mascota perritolindo"
        )

        Text(
            "Mascota Feliz",
            color = Color.Blue,
            fontSize = 48.sp
        )
        Text("Bienvenido, usuario")
        Row() {
            OutlinedButton(onClick = {/*TODO*/ }) {
                Text("Tu mascota")
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = {/*TODO*/ }) {
                Text("Contenidos")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosPreview(){
    MascotaFeliz01Theme {



    Elementos()
}
}
