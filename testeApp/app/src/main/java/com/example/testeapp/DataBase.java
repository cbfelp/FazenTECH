package com.example.testeapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

 /* CONSTRUCTOR VERSION DATABASE */
public class DataBase extends SQLiteOpenHelper {
    private static final int VERSION_BASE = 1;
    /* CREATION DATABASE DB_CLIENTS*/
    private static final String NAME_BASE = "db_Clients";

     private static final String TABLE_BASE = "tb_Clients";

     private static final String COLUMN_ADRESS = "Adress";
     private static final String COLUMN_CPF = "Cpf";
     private static final String COLUMN_DATE = "Date";
     private static final String COLUMN_EMAIL = "Email";
     private static final String COLUMN_NAME = "Name";
     private static final String COLUMN_PASSWORD = "Password";


    public DataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME_BASE, null, VERSION_BASE);

    }
    /*CREATOR OF DATABASE*/
    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_COLUMN = "CREATE TABLE" + TABLE_BASE + "("+ COLUMN_CPF + " INTEGER PRIMARY KEY," + COLUMN_ADRESS +" TEXT," + COLUMN_DATE +" INTEGER," + COLUMN_EMAIL + " TEXT," + COLUMN_NAME + " TEXT," + COLUMN_PASSWORD + " INTEGER)";

        db.execSQL(QUERY_COLUMN);
    }
    /*CREATOR OF UPGRADE DATABASE*/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    /* CRUD HERE */
    Void addClient(Client client) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();


    }

}