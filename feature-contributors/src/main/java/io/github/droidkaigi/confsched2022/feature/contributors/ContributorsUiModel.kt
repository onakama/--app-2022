package io.github.droidkaigi.confsched2022.feature.contributors

import io.github.droidkaigi.confsched2022.model.Contributor
import io.github.droidkaigi.confsched2022.ui.LoadState
import kotlinx.collections.immutable.PersistentList

data class ContributorsUiModel(
    val contributorsState: LoadState<PersistentList<Contributor>>,
)
