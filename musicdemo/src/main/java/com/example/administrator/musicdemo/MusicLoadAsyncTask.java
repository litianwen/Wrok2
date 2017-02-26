package com.example.administrator.musicdemo;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.example.administrator.mylib.utils.FileUtils;

import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MusicLoadAsyncTask extends AsyncTask<Void, Void, List<File>> {

    private OnFileFinishListener onFileFinish;

    public MusicLoadAsyncTask(@NonNull OnFileFinishListener onFileFinish) {
        this.onFileFinish = onFileFinish;
    }

    @Override
    protected List<File> doInBackground(Void... params) {
        String[] suffix = {".mp3", ".wav"};
        return FileUtils.getSuffixFile(suffix);
    }

    @Override
    protected void onPostExecute(List<File> fileList) {
        super.onPostExecute(fileList);
        onFileFinish.fileFinish(fileList);
    }

    public interface OnFileFinishListener {
        public void fileFinish(List<File> list);
    }
}
