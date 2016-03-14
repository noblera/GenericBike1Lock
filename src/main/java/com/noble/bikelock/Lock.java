package com.noble.bikelock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Lock extends AppCompatActivity {

    private final String MY_UUID = "55253730-6d50-9898-7b4a2f5fff08";

    private TextView mLockStatus;
    private Button mLockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);

        mLockStatus = (TextView) findViewById(R.id.lock_status_text_view);
        mLockStatus.setText(R.string.status_locked);

        mLockButton = (Button) findViewById(R.id.lock_button);
        mLockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLockStatus.getText().toString().equals("Unlocked")) {
                    mLockStatus.setText(R.string.status_locked);
                } else {
                    Toast.makeText(Lock.this, "Bike Already Locked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
