package cz.mendelu.pef.microlearning.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cz.mendelu.pef.microlearning.model.db.NodeDB
import cz.mendelu.pef.microlearning.model.db.SavedTopic

@Database(
    entities = [SavedTopic::class, NodeDB::class],
//    entities = [Label::class, Place::class],
    version = 1,
    exportSchema = true
)
//@TypeConverters(Converters::class)
abstract class MicrolearningDatabase :
    RoomDatabase() { // abychom pracovali se soubory, potrebujeme context

    abstract fun dao(): MicrolearningDao // propojeni mezi db a daem

    companion object {
        private var INSTANCE: MicrolearningDatabase? = null

        fun getDatabase(context: Context): MicrolearningDatabase {
            if (INSTANCE == null) {
                synchronized(MicrolearningDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            MicrolearningDatabase::class.java,
                            "microlearning_db"
                        )
//                            .createFromAsset("database/init.db")
//                            .addTypeConverter(Converters())
                            .build()
                    }
                }
            }
            return INSTANCE!!
        }
    }
}
