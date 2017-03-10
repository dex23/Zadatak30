package com.example.androiddevelopment.zadatakglumci.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 10.3.17..
 */

@DatabaseTable(tableName = Filmovi.TABLE_NAME_FILMOVI)
public class Filmovi {
    public static final String TABLE_NAME_FILMOVI = "filmovi";
    public static final String FIELD_NAME_ID = "id";
    public static final String FIELD_NAME_NAME = "name";

    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int mId;
    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;

    public Filmovi() {

    }

    public static String getTableNameFilmovi() {
        return TABLE_NAME_FILMOVI;
    }

    public String getmName() {
        return mName;
    }

    public int getmId() {
        return mId;
    }

    public static String getFieldNameName() {
        return FIELD_NAME_NAME;
    }

    public static String getFieldNameId() {
        return FIELD_NAME_ID;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
