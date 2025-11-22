package cz.mendelu.pef.microlearning.model

import cz.mendelu.pef.microlearning.MainApplication
import cz.mendelu.pef.microlearning.R

enum class
//object
Modes (var value: String, var supportingText: String) {
//    REVISION, // uceni pomoci lekci bez testu
//    TUITION, // uceni pomoci lekci a nasledne vyzkouseni testem
//    TESTING, // uceni pomoci testu
    Revision(MainApplication.appContext.getString(R.string.modes_revision), MainApplication.appContext.getString(R.string.modes_revision_supptext)),
    Tuition(MainApplication.appContext.getString(R.string.modes_tuition), MainApplication.appContext.getString(R.string.modes_tuition_supptext)),
    Testing(MainApplication.appContext.getString(R.string.modes_testing),MainApplication.appContext.getString(R.string.modes_testing_supptext));

//    companion object {
//        val values = listOf(Revision, Tuition, Testing)
//    }

}
