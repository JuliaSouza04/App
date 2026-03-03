package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(16.dp)){

                        Cartao(modifier = Modifier.padding(innerPadding), msg = "Cartão De Visitas DEV")
                        Imagem(modifier = Modifier)
                        Nome(modifier = Modifier.padding(innerPadding), msg = "Júlia De Souza Bonfim")
                        Biografia(modifier = Modifier, msg = "Tenho 17 anos, nasci e moro em Presidente Prudente. Sou uma pessoa muito carinhosa, esforçada e dedicada em tudo o que faço. Atualmente, curso Desenvolvimento de Sistemas no Senai e estudo no Sesi, sempre buscando aprender mais e evoluir e nas horas livres adoro assistir séries de romance e ir para a academia.")

                    }
                }
            }
        }
    }
}

@Composable
fun Cartao(modifier: Modifier, msg: String){
    Text(text = msg, modifier = modifier, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
}

@Composable
fun Imagem(modifier: Modifier){
    Image(painter = painterResource(id = R.drawable.cachorro), contentDescription = "Foto de Perfil", modifier = Modifier
        .size(200.dp)
        .clip(CircleShape)
        .border(
            3.dp, Color.Blue,
            CircleShape
        ), contentScale = ContentScale.Crop)
}

@Composable
fun Nome(modifier: Modifier, msg: String){
    Text(text = msg, modifier = modifier, fontSize = 20.sp,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
}

@Composable
fun Biografia(modifier: Modifier, msg: String){
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier.size(width = 274.dp, height = 276.dp)
    ) {
        Text(text = msg, modifier = modifier, fontSize = 17.sp,fontWeight = FontWeight.W300, textAlign = TextAlign.Center )
    }
}
