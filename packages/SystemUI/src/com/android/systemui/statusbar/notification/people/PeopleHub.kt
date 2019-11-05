/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.notification.people

import android.app.PendingIntent
import android.graphics.drawable.Drawable

/** `ViewModel` for PeopleHub view. */
data class PeopleHubViewModel(val people: Sequence<PersonViewModel>, val isVisible: Boolean)

/** `ViewModel` for a single "Person' in PeopleHub. */
data class PersonViewModel(
    val name: CharSequence,
    val icon: Drawable,
    val onClick: () -> Unit
)

/** `Model` for PeopleHub. */
data class PeopleHubModel(val people: Collection<PersonModel>)

/** `Model` for a single "Person" in PeopleHub. */
data class PersonModel(
    val key: PersonKey,
    val name: CharSequence,
    val avatar: Drawable,
    val clickIntent: PendingIntent
)

/** Unique identifier for a Person in PeopleHub. */
typealias PersonKey = String