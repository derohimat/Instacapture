package com.tarek360.sample;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.tarek360.sample.uncapturableViews.GLSurfaceViewRenderer;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by tarek on 10/4/16.
 */

public class GLSurfaceViewSampleActivity extends BaseSampleActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_surface_view_sample);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GLSurfaceView glSurfaceView = (GLSurfaceView) findViewById(R.id.glSurfaceView);

        glSurfaceView.setRenderer(new GLSurfaceViewRenderer());
    }

    @OnClick(R.id.fab)
    public void onClickFAB(View view) {
        captureScreenshot(view);
    }
}
