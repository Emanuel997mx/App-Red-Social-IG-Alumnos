package com.unam.appredsocialigalumnos.network

interface Callback <T> {
    fun onSuccess(result: T?)

    fun onFailed(exception: Exception)
}