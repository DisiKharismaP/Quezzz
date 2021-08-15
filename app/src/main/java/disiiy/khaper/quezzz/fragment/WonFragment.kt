package disiiy.khaper.quezzz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import disiiy.khaper.quezzz.R
import disiiy.khaper.quezzz.databinding.FragmentOverBinding
import disiiy.khaper.quezzz.databinding.FragmentWonBinding

class WonFragment : Fragment() {

    private lateinit var wonBinding: FragmentWonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        wonBinding = FragmentWonBinding.inflate(inflater, container, false)
        return wonBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        wonBinding.btnGotItWon.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_wonFragment_to_welcomeFragment))

    }

}