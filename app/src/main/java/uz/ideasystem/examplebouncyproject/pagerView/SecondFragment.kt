package uz.ideasystem.examplebouncyproject.pagerView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.viewbinding.library.fragment.viewBinding
import com.factor.bouncy.util.Bouncy
import uz.ideasystem.examplebouncyproject.R
import uz.ideasystem.examplebouncyproject.adapter.RvAdapter
import uz.ideasystem.examplebouncyproject.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private val binding:FragmentSecondBinding by viewBinding()
    private val listItems = arrayListOf("Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test")
    private val rvAdapter:RvAdapter by lazy { RvAdapter(listItems) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            rvBounds.adapter = rvAdapter

            rvBounds.flingAnimationSize = 0.7f
            rvBounds.overscrollAnimationSize = 0.7f
            rvBounds.dampingRatio = Bouncy.DAMPING_RATIO_LOW_BOUNCY
            rvBounds.stiffness = Bouncy.STIFFNESS_MEDIUM
        }
    }
}