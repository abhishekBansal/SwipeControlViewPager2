package dev.abhishekbansal.swipecontrolviewpager2

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.tabs.TabLayoutMediator
import dev.abhishekbansal.swipecontrolviewpager2.ui.main.SectionsPagerAdapter
import dev.abhishekbansal.swipecontrolviewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val colorList = listOf(Color.CYAN, Color.GREEN, Color.YELLOW)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, colorList)
        binding.viewPager.adapter = sectionsPagerAdapter

        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            tab.text = when(position) {
                0 -> "CYAN"
                1 -> "GREEN"
                2 -> "YELLOW"
                else -> ""
            }
        }.attach()
    }
}