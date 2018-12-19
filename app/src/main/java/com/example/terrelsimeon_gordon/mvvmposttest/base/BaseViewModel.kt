package com.example.terrelsimeon_gordon.mvvmposttest.base

import android.arch.lifecycle.ViewModel
import com.example.terrelsimeon_gordon.mvvmposttest.injection.module.NetworkModule
import com.example.terrelsimeon_gordon.mvvmposttest.injection.module.component.ViewModelInjector
import com.example.terrelsimeon_gordon.mvvmposttest.ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}