package com.example.aimanizhar_mobile_app_1;

import android.provider.BaseColumns;


public final class DatabaseContract {
    private DatabaseContract() {}

    public static class UserEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_AGE = "age";
    }
}

