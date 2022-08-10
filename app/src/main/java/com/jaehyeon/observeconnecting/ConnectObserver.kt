package com.jaehyeon.observeconnecting

import kotlinx.coroutines.flow.Flow

/**
 * Created by Jaehyeon on 2022/08/11.
 */
interface ConnectObserver {

    fun observer(): Flow<Status>

    enum class Status {
        Available, Unavailable, Losing, Lost
    }
}