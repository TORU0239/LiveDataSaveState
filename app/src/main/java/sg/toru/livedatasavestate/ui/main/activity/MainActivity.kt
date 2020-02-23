package sg.toru.livedatasavestate.ui.main.activity

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.SavedStateViewModelFactory
import sg.toru.livedatasavestate.BR
import sg.toru.livedatasavestate.R
import sg.toru.livedatasavestate.databinding.ActivityMainBinding
import sg.toru.livedatasavestate.ui.main.viewmodel.MainViewModel
import sg.toru.livedatasavestate.ui.second.activity.SecondActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel:MainViewModel by viewModels {
        SavedStateViewModelFactory(application, this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = findViewById<ViewGroup>(R.id.container)
        val binding: ActivityMainBinding? = DataBindingUtil.bind(root)

        binding?.btnGoToNext?.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
        binding?.setVariable(BR.name, "TEST!!!")
    }
}