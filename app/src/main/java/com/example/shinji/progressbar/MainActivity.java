package com.example.shinji.progressbar;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar1 = (ProgressBar)findViewById(R.id.ProgressBarHorizontal);
        progressBar1.setMax(100); // 水平プログレスバーの最大値を設定
        progressBar1.setProgress(20); // 水平プログレスバーの値を設定
        progressBar1.setSecondaryProgress(60); // 水平プログレスバーのセカンダリ値を設定
        //progressBar1.setScaleY(30f); // 高さを指定

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("処理を実行中しています");
        progressDialog.setCancelable(true);
        progressDialog.show();

    }
}
