package com.example.kmap_ex

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import com.example.kmap_ex.databinding.ActivityMainBinding
import com.kakao.util.maps.helper.Utility
import net.daum.mf.map.api.MapView
import java.security.MessageDigest

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var keyhash = Utility.getKeyHash(this)
        println("keyhash= $keyhash")
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mapView = MapView(this)
        binding.clKakaoMapView.addView(mapView)



    }
}