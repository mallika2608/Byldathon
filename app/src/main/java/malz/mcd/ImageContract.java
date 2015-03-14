package malz.mcd;

import android.provider.BaseColumns;

/**
 * Created by Mallika on 14/03/2015.
 */
public final class ImageContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public ImageContract() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "people";
        public static final String COLUMN_NAME_SSN = "ssn";
        public static final String COLUMN_NAME_NAME= "name";
        public static final String COLUMN_NAME_GENDER = "gender";

    }
}
