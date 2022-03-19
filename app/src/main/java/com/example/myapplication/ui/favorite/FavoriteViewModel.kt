package com.example.myapplication.ui.favorite

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Repository.FavoriteUserRepository
import com.example.myapplication.database.UserFavorite

class FavoriteViewModel(application: Application) : ViewModel() {

    private val mFavoriteUserRepository: FavoriteUserRepository =
        FavoriteUserRepository(application)

    fun getAllListFavorite(): LiveData<List<UserFavorite>> =
        mFavoriteUserRepository.getAllFavoriteUser()
}