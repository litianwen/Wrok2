package com.example.administrator.lesson19_mmall;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */

public class MeiNv implements Parcelable {

    //将需要的数据取出来

    String title;
    String ct;

    String img;//第一张图片

    List<String> imgList;
    public MeiNv(String title, String ct, String img, List<String> imgList) {
        this.title = title;
        this.ct = ct;
        this.img = img;
        this.imgList = imgList;
    }

    public MeiNv() {
    }

    protected MeiNv(Parcel in) {
        title = in.readString();
        ct = in.readString();
        img = in.readString();
        imgList = in.createStringArrayList();
    }

    public static final Creator<MeiNv> CREATOR = new Creator<MeiNv>() {
        @Override
        public MeiNv createFromParcel(Parcel in) {
            return new MeiNv(in);
        }

        @Override
        public MeiNv[] newArray(int size) {
            return new MeiNv[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }


    @Override
    public String toString() {
        return "MeiNv{" +
                "title='" + title + '\'' +
                ", ct='" + ct + '\'' +
                ", img='" + img + '\'' +
                ", imgList=" + imgList +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(ct);
        dest.writeString(img);
        dest.writeStringList(imgList);
    }
}
