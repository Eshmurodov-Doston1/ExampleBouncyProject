package uz.ideasystem.examplebouncyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.viewbinding.library.activity.viewBinding
import androidx.viewpager2.widget.ViewPager2
import uz.ideasystem.examplebouncyproject.adapter.ViewPagerAdapter
import uz.ideasystem.examplebouncyproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by viewBinding()
    private val viewPagerAdapter:ViewPagerAdapter by lazy {
        ViewPagerAdapter(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            viewPager2.adapter = viewPagerAdapter
            viewPager2.isUserInputEnabled = false

            nextBtn.setOnClickListener{
                if (viewPager2.currentItem == 1){
                    viewPager2.setCurrentItem(0,true)
                } else viewPager2.setCurrentItem(1,true)

            }

//            viewPager2.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
//                override fun onPageSelected(position: Int) {
//                    super.onPageSelected(position)
//
//                }
//            })
        }
    }
}