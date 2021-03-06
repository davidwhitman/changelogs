/*
 * Copyright (c) 2017.
 * Distributed under the GNU GPLv3 by David Whitman.
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * This source code is made available to help others learn. Please don't clone my app.
 */

package com.thunderclouddev.dataprovider

import android.content.Context
import com.thunderclouddev.persistence.AppInfoDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by David Whitman on 05 May, 2017.
 */
@Module
class DataProviderModule {
    companion object {
        var debugMode = false
    }

    @Singleton
    @Provides
    fun database(context: Context): Database
            = Database(AppInfoDatabase.create(context, debugMode))
}