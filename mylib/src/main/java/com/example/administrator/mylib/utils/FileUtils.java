package com.example.administrator.mylib.utils;

import android.os.Environment;
import android.os.StatFs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */

public class FileUtils {
    // 文件操作

    public static final List<File> getAllFile() {
        List<File> files = new ArrayList<>();
        getFileFromDir(Environment.getExternalStorageDirectory(), files);
        return files;
    }

    public static final List<File> getAllFile(File dir) {
        List<File> files = new ArrayList<>();
        getFileFromDir(dir, files);
        return files;
    }


    public static final void getFileFromDir(File dir, List<File> fileList) {
        File[] files = dir.listFiles();
        if (files == null)
            return;
        for (File file : files) {
            if (file.isDirectory())
                getFileFromDir(file, fileList);
            fileList.add(file);
        }
    }

    public static final List<File> getAllPicture(File dir) {
        List<File> files = getAllFile(dir);
        List<File> imgList = new ArrayList<>();
        for (File file : files) {
            if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg"))
                imgList.add(file);
        }
        return imgList;
    }

    public static final List<File> getAllPicture() {
        return getAllPicture(Environment.getExternalStorageDirectory());
    }

    //获取指定后缀的文件
    public static final List<File> getSuffixFile(List<File> dir, String[] suffix) {
        List<File> result = new ArrayList<>();
        if (dir == null) {
            dir = getAllFile();
        }
        for (File file : dir) {
            String name = file.getName();
            //所有的后缀
            for (String s : suffix) {
                if (name.endsWith(s)) {
                    result.add(file);
                }
            }

        }
        return result;
    }

    public static final List<File> getSuffixFile(String[] suffix) {
        return getSuffixFile(null, suffix);
    }


    //获取SD卡总空间
    public static long getSDCardSize() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        int block = statFs.getBlockSize();
        int count = statFs.getBlockCount();
        return block * count;
    }

    //获取SD卡可用空间
    public static long getSDCardAvailableSize() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        int block = statFs.getBlockSize();
        int count = statFs.getAvailableBlocks();
        return block * count;
    }

    public static long getInternalSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        int block = statFs.getBlockSize();
        int count = statFs.getBlockCount();
        return block * count;
    }

    public static long getInternalAvailableSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        int block = statFs.getBlockSize();
        int count = statFs.getAvailableBlocks();
        return block * count;
    }


    //一段时间内的文件
    public static List<File> getLastFileByDay(List<File> files, int day) {
        if (files == null)
            files = getAllFile();
        //index == 几天内
        long poor = day * 24 * 60 * 60 * 1000;
        List<File> fileList = new ArrayList<>();
        for (File file : files) {
            if (System.currentTimeMillis() - poor < file.lastModified()) {
                fileList.add(file);
            }
        }
        return fileList;
    }

    public static List<File> getLastFileByDay(int day) {
        return getLastFileByDay(null, day);
    }
}
