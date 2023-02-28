package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TituloDoApp()
                    Saudacoes("Alunos")
                }
            }
        }
    }
}

@Composable
fun Saudacoes(name: String) {
    Text(text = "Bem-vindos $name!",
        fontStyle = FontStyle.Italic,
        TextAlign = TextAlign.Center,


    )

    
}

@Composable
fun TituloDoApp(){
    Text(text = "Meu primeiro App",
    fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        TextAlign = TextAlign.Center,

    )


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Column() {
            TituloDoApp()
            Saudacoes("Senhorios")
        }


    }


}
