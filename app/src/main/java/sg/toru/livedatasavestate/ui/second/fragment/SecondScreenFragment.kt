package sg.toru.livedatasavestate.ui.second.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import sg.toru.livedatasavestate.R
import sg.toru.livedatasavestate.databinding.FragmentSecondScreenBinding

/**
 * A simple [Fragment] subclass.
 */
class SecondScreenFragment : Fragment(R.layout.fragment_second_screen) {

    private var binding: FragmentSecondScreenBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)
    }

    companion object {
        fun instance() = SecondScreenFragment()
    }
}
