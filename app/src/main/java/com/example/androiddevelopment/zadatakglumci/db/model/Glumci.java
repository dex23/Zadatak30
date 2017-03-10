package com.example.androiddevelopment.zadatakglumci.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 10.3.17..
 */

@DatabaseTable(tableName = Glumci.TABLE_NAME_GLUMCI)
public class Glumci {

    public static final String TABLE_NAME_GLUMCI = "glumci";

    public static final String FIELD_NAME_ID     = "id";
    public static final String FIELD_NAME_NAME   = "name";
    public static final String FIELD_NAME_DESCRIPTION   = "description";
    public static final String FIELD_NAME_RATING   = "rating";
    public static final String FIELD_NAME_IMAGE  = "image";
    public static final String FIELD_NAME_CATEGORY = "category";

    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int mId;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;

    @DatabaseField(columnName = FIELD_NAME_DESCRIPTION)
    private String description;

    @DatabaseField(columnName = FIELD_NAME_RATING)
    private float rating;

    @DatabaseField(columnName = FIELD_NAME_IMAGE)
    private String image;

    @DatabaseField(columnName = FIELD_NAME_CATEGORY, foreign = true, foreignAutoCreate = true,foreignAutoRefresh = true)
    private Glumci category;

    //ORMLite zahteva prazan konstuktur u klasama koje opisuju tabele u bazi!
    public Glumci() {
    }

    /** Getters & Setters **/

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return  mName;
    }

    public Glumci getGlumci() {
        return category;
    }

    public void setGlumci(Filmovi filmovi) {
        this.category = category;
    }

    public class TABLE_NAME_GLUMCI {
    }
}