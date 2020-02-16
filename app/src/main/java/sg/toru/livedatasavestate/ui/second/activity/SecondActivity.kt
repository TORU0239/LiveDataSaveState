package sg.toru.livedatasavestate.ui.second.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sg.toru.livedatasavestate.R
import sg.toru.livedatasavestate.ui.second.fragment.SecondScreenFragment

class SecondActivity : AppCompatActivity(R.layout.activity_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(R.id.containerFragment,
            SecondScreenFragment()
        )
    }
}