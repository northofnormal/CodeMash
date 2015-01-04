package com.brbw.codemash.controllers.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.brbw.codemash.models.Session;

public class SessionDetailsActivity extends ActionBarActivity {

    private static final String LOG_TAG = "SessionDetailsActivity";
    private static final String SESSION_EXTRA = "SESSION_EXTRA";

    public static Intent newIntentToStart(Context context,Session session) {
        Intent intent = new Intent(context,SessionDetailsActivity.class);
        intent.putExtra(SESSION_EXTRA,session);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Session session = (Session) getIntent().getSerializableExtra(SESSION_EXTRA);
        Log.d(LOG_TAG,session.toString());
    }
}
