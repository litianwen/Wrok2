package com.example.administrator.lesson18_parcelable;

import android.os.Parcel;
import android.os.Parcelable;


public class User implements Parcelable {
    // Serializable 可以读写到本地，也可以通过网络传递,效率非常慢，会创建非常多的临时对象。
    //Parcelable 不能读写到本地，只能在网络,Intent,AIDL 中传递,效率非常快。

    String username;
    String password;
    int age;
    boolean isAnmin;
    double money;

    protected void read(Parcel in) {
        username = in.readString();
        password = in.readString();
        age = in.readInt();
        isAnmin = in.readByte() != 0;
        money = in.readDouble();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            User user = new User();
            user.read(in);
            return user;
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
        dest.writeInt(age);
        dest.writeByte((byte) (isAnmin ? 1 : 0));
        dest.writeDouble(money);
    }
}
