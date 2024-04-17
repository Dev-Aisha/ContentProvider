package com.example.contentprovider

import android.media.Image
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContentProviderViewModel : ViewModel(){
    var imagesSate = mutableStateOf(emptyList<ContentProviderDataItem>())

    fun updateImages(images: List<ContentProviderDataItem>){
        imagesSate.value= images
    }
}