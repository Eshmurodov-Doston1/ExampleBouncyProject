package uz.ideasystem.examplebouncyproject.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.ideasystem.examplebouncyproject.pagerView.FirstFragment
import uz.ideasystem.examplebouncyproject.pagerView.SecondFragment

class ViewPagerAdapter(private val fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
       return when(position){
            0->{
                FirstFragment()
            }
            1->{
                SecondFragment()
            }
           else ->{
               FirstFragment()
           }
        }
    }
}