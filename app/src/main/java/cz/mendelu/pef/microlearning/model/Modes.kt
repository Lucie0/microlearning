package cz.mendelu.pef.microlearning.model

import cz.mendelu.pef.microlearning.R

enum class Modes(var stringId: Int, var supportingTextId: Int) {
    REVISION(R.string.modes_revision, R.string.modes_revision_supptext),
    TUITION(R.string.modes_tuition, R.string.modes_tuition_supptext),
    TESTING(R.string.modes_testing, R.string.modes_testing_supptext)
}