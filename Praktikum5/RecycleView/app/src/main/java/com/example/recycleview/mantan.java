package com.example.recycleview;

import android.os.Parcel;
import android.os.Parcelable;

public class mantan implements Parcelable{
    private String name;
    private String description;
    private String photo;

    public String getName(){

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription(){

        return description ;
    }

    public void setDescription(String description) {

        this.description = description;
    }
{

    }
    public String getPhoto(){

        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public int describeContents() {
        return 0;
    }
    public void writeToParcel(Parcel dest,int flags){
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.photo);
    }

    public static final Parcelable.Creator<mantan>CREATOR=new Parcelable.Creator<mantan>() {
        @Override
        public mantan createFromParcel(Parcel source) {
            return new mantan();
        }

        @Override
        public mantan[] newArray(int size) {
            return new mantan[size];
        }
    };
}

