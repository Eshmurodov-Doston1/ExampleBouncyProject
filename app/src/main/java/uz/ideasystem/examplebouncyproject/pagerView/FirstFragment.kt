package uz.ideasystem.examplebouncyproject.pagerView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.viewbinding.library.fragment.viewBinding
import uz.ideasystem.examplebouncyproject.R
import uz.ideasystem.examplebouncyproject.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
  private val binding:FragmentFirstBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding.apply {

       }
    }
}