package id.ac.polbeng.tamarablezinky.fragmentexample2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.ac.polbeng.tamarablezinky.fragmentexample2.databinding.BookTitlesBinding

class BookTitle : Fragment(), View.OnClickListener {

    private lateinit var binding: BookTitlesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BookTitlesBinding.inflate(inflater, container, false)
        // Set up click listeners
        binding.learnAp.setOnClickListener(this)
        binding.learnApWithKotlin.setOnClickListener(this)
        binding.minimumAp.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View) {
        var index = 0
        when (v.id) {
            R.id.learn_ap -> {
                index = 0
            }
            R.id.learn_ap_with_kotlin -> {
                index = 1
            }
            R.id.minimum_ap -> {
                index = 2
            }
        }
        val activity = activity
        if (activity is Coordinator) {
            activity.onBookChanged(index)
        }
    }
}
