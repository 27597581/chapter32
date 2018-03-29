package cn.edu.hqu.cst.android.chapter3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SingleInstanceLaunchModeActivity extends AppCompatActivity {

    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance_launch_mode);
        txt=(TextView)findViewById(R.id.TxtDesc);
        txt.setText("当前Activity为:"+this.toString()+"所在TaskID为："+this.getTaskId());
    }
}
