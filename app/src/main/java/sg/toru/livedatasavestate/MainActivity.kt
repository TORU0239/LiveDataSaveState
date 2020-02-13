package sg.toru.livedatasavestate

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import sg.toru.livedatasavestate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = findViewById<ViewGroup>(R.id.container)
        val binding: ActivityMainBinding? = DataBindingUtil.bind(root)
        binding?.setVariable(BR.name, "TEST!!!")
    }
}
