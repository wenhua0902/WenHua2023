package tw.edu.pu.gm.s1100396.wenhua2023

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.gm.s1100396.wenhua2023.ui.theme.WenHua2023Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WenHua2023Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    MapScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}



@Composable
fun MapScreen() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        
        Text(text = "作者:資管二B 黃汶樺")
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "清水地圖"
        )
    }
    
    Box(modifier = Modifier.fillMaxSize()
    ){
        Canvas(modifier = Modifier){
            drawRect(Color.Blue, Offset(1611f, 915f), Size(40f,40f))
            drawRect(Color.Blue, Offset(780f, 200f), Size(40f,40f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WenHua2023Theme {
        Greeting("Android")
    }
}