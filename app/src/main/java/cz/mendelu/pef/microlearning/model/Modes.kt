package cz.mendelu.pef.microlearning.model

import cz.mendelu.pef.microlearning.MainApplication
import cz.mendelu.pef.microlearning.R

enum class
//object
Modes (var value: String) {
//    REVISION, // uceni pomoci lekci bez testu
//    TUITION, // uceni pomoci lekci a nasledne vyzkouseni testem
//    TESTING, // uceni pomoci testu
    Revision(MainApplication.appContext.getString(R.string.modes_revision)),
    Tuition(MainApplication.appContext.getString(R.string.modes_tuition)),
    Testing(MainApplication.appContext.getString(R.string.modes_testing));

//    companion object {
//        val values = listOf(Revision, Tuition, Testing)
//    }

}
