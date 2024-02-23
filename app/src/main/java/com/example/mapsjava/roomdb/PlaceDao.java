package com.example.mapsjava.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mapsjava.model.Place;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface PlaceDao {

    @Query("SELECT * FROM Place")
    Flowable<List<Place>> getAll();  //Flowable, sorgu sonucunda dönecek verilerin akışını temsil eder.

    @Insert
    Completable insert (Place place);

    @Delete
    Completable delete (Place place);

}
