package com.zaker.android.sapeh.app.main.activitylist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ScrollView;

import androidx.core.content.ContextCompat;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.marcoscg.materialtoast.MaterialToast;
import com.melnykov.fab.FloatingActionButton;
import com.realpacific.clickshrinkeffect.ClickShrinkEffect;
import com.zaker.android.sapeh.app.main.BounceTouchListener;
import com.zaker.android.sapeh.R;
import com.zaker.android.sapeh.app.main.MainRecActivity;
import com.zaker.android.sapeh.app.main.bubble.BubbleLayout;
import com.zaker.android.sapeh.app.main.cookiebar.CookieBar;
import com.zaker.android.sapeh.app.main.foltingtoast.FloatingToast;
import com.zaker.android.sapeh.app.main.recordview.*;
import com.zaker.android.sapeh.app.main.shinebuttonlib.ShineButton;

import java.util.concurrent.TimeUnit;


public class Activity13List extends SlidingUpBaseActivity<ObservableScrollView>
        implements ObservableScrollViewCallbacks {

    Context context = this;
    MediaPlayer m1,m2,m3,backb,finalpop;
    Toolbar toolbar;
    ScrollView scrollView;
    View header;
    ShineButton po_image,po_image1,po_image2,po_image3,po_image4,po_image5,
            po_image6,po_image7,po_image8,po_image9;

    RecordView recordView;
    RecordButton recordButton;
    ImageView img1,img2;
    BubbleLayout kal,kal1,kal2,kal3,kal4,kal5,kal6,kal7,kal8,kal9,kal10,badge,badge1,badge2,badge3,badge4,badge5,badge6;
    FloatingActionButton fab;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity13_list;

    }

    @Override
    protected ObservableScrollView createScrollable() {
        ObservableScrollView scrollView =  findViewById(R.id.scroll);
        scrollView.setScrollViewCallbacks(this);
        return scrollView;
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        header = findViewById(R.id.header_image_view);
        scrollView =  findViewById(R.id.scroll_view);
        BounceTouchListener bounceTouchListener = BounceTouchListener.create
                (scrollView, R.id.content,
                        new BounceTouchListener.OnTranslateListener() {
                            @Override
                            public void onTranslate(float translation) {
                                if (translation > 0) {
                                    float scale = ((2 * translation) /
                                            header.getMeasuredHeight()) + 1;
                                    header.setScaleX(scale);
                                    header.setScaleY(scale);
                                }
                            }
                        }
                );

        scrollView.setOnTouchListener(bounceTouchListener);

        toolbar =  findViewById(R.id.toolbar);

        backb = MediaPlayer.create(this, R.raw.backb);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                new MaterialToast(context)
                        .setMessage(getResources().getString(R.string.bybyback))
                        .setIcon(R.mipmap.ic_kaba1)
                        .setDuration(Toast.LENGTH_SHORT)
                        .setBackgroundColor(Color.parseColor("#62496F"))
                        .show();

                m1.stop();m2.stop();m3.stop();backb.start();
            }
        });

        po_image = findViewById(R.id.po_image);
        po_image1 = findViewById(R.id.po_image1);
        po_image2 = findViewById(R.id.po_image2);
        po_image3 = findViewById(R.id.po_image3);
        po_image4 = findViewById(R.id.po_image4);
        po_image5 = findViewById(R.id.po_image5);
        po_image6 = findViewById(R.id.po_image6);
        po_image7 = findViewById(R.id.po_image7);
        po_image8 = findViewById(R.id.po_image8);
        po_image9 = findViewById(R.id.po_image9);
        m1 = MediaPlayer.create(this, R.raw.ma1rem46);
        m2 = MediaPlayer.create(this, R.raw.al1emran38);
        m3 = MediaPlayer.create(this, R.raw.an1biaa9089);
        finalpop = MediaPlayer.create(this, R.raw.finalpop);

        po_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image.isChecked()){
                    finalpop.start();
                }
            }
        });
        po_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image1.isChecked()){
                    finalpop.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.sourah19), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                }
            }
        });
        po_image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image2.isChecked()){
                    finalpop.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.z4_7), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                }
            }
        });
        po_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image3.isChecked()){
                    finalpop.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.sourah3), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                }
            }
        });
        po_image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image4.isChecked()){
                    finalpop.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.z38), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                }
            }
        });
        po_image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image5.isChecked()){
                    finalpop.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.surah21), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                }
            }
        });
        po_image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po_image6.isChecked()){
                    finalpop.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.z8990), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                }
            }
        });
        po_image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                po_image7.setChecked(false);
                if (m1.isPlaying()) {
                    m1.stop();
                    m1.prepareAsync();
                    m1.seekTo(0);
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.stop), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                } else {
                    po_image7.setChecked(true);
                    m1.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.play), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#ffffff"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#62496F"))
                            .show();    //Show toast at the specified fixed position
                    if (m2.isPlaying()) {
                        m2.stop();
                        m2.prepareAsync();
                        m2.seekTo(0);
                    }
                    if (m3.isPlaying()) {
                        m3.stop();
                        m3.prepareAsync();
                        m3.seekTo(0);
                    }
                    if (po_image8.isChecked())
                        po_image8.setChecked(false);
                    if (po_image9.isChecked())
                        po_image9.setChecked(false);
                }
            }
        });
        po_image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                po_image8.setChecked(false);
                if (m2.isPlaying()) {
                    m2.stop();
                    m2.prepareAsync();
                    m2.seekTo(0);
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.stop), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                } else {
                    po_image8.setChecked(true);
                    m2.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.play), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#ffffff"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#62496F"))
                            .show();    //Show toast at the specified fixed position
                    if (m1.isPlaying()) {
                        m1.stop();
                        m1.prepareAsync();
                        m1.seekTo(0);
                    }
                    if (m3.isPlaying()) {
                        m3.stop();
                        m3.prepareAsync();
                        m3.seekTo(0);
                    }
                    if (po_image7.isChecked())
                        po_image7.setChecked(false);
                    if (po_image9.isChecked())
                        po_image9.setChecked(false);


                }
            }
        });
        po_image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                po_image9.setChecked(false);
                if (m3.isPlaying()) {
                    m3.stop();
                    m3.prepareAsync();
                    m3.seekTo(0);
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.stop), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#62496F"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#000000"))
                            .show();    //Show toast at the specified fixed position
                } else {
                    po_image9.setChecked(true);
                    m3.start();
                    FloatingToast.makeToast(Activity13List.this, getResources().getString(R.string.play), FloatingToast.LENGTH_TOO_LONG)
                            .setGravity(FloatingToast.GRAVITY_BOTTOM)
                            .setFadeOutDuration(FloatingToast.FADE_DURATION_TOO_LONG)
                            .setTextSizeInDp(getResources().getDimensionPixelSize(R.dimen._9mdp))
                            .setTextTypeface(Typeface.createFromAsset(getAssets(), "fonts/toto.ttf"))
                            .setBackgroundBlur(true)
                            .setFloatDistance(FloatingToast.DISTANCE_LONG)
                            .setTextColor(Color.parseColor("#ffffff"))
                            .setShadowLayer(5, 1, 1, Color.parseColor("#62496F"))
                            .show();    //Show toast at the specified fixed position
                    if (m1.isPlaying()) {
                        m1.stop();
                        m1.prepareAsync();
                        m1.seekTo(0);
                    } if (m2.isPlaying()) {
                        m2.stop();
                        m2.prepareAsync();
                        m2.seekTo(0);
                    }
                    if (po_image7.isChecked())
                        po_image7.setChecked(false);
                    if (po_image8.isChecked())
                        po_image8.setChecked(false);

                }
            }
        });



        GradientDrawable shapeDrawable= (GradientDrawable) ContextCompat.getDrawable(this,R.drawable.recv_bg_mic);
        shapeDrawable.setColor(getResources().getColor(R.color.shape13));
        recordView = findViewById(R.id.record_view);
        recordButton = findViewById(R.id.record_button);
        recordButton.setBackground(shapeDrawable);

        //IMPORTANT
        recordButton.setRecordView(recordView);

        //ListenForRecord must be false ,otherwise onClick will not be called
        recordButton.setOnRecordClickListener(new OnRecordClickListener() {
            @SuppressLint("LogNotTimber")
            @Override
            public void onClick(View v) {
                Log.d("RecordButton", "RECORD BUTTON CLICKED");
            }
        });


        //Cancel Bounds is when the Slide To Cancel text gets before the timer . default is 8
        recordView.setCancelBounds(8);
        recordView.setSmallMicColor(Color.parseColor("#c2185b"));
        recordView.setSlideToCancelText(getResources().getString(R.string.slide_to_cancel));
        //disable Sounds
        recordView.setSoundEnabled(true);
        //prevent recording under one Second (it's false by default)
        recordView.setLessThanSecondAllowed(false);
        //set Custom sounds onRecord
        //you can pass 0 if you don't want to play sound in certain state
        //change slide To Cancel Text Color
        recordView.setSlideToCancelTextColor(getResources().getColor(R.color.gray_light));
        //change slide To Cancel Arrow Color
        recordView.setSlideToCancelArrowColor(getResources().getColor(R.color.gray_light));
        //change Counter Time (Chronometer) color
        recordView.setCounterTimeColor(getResources().getColor(R.color.gray_dark));
        recordView.setCustomSounds(R.raw.record_start, R.raw.record_finished, R.raw.record_error);


        recordView.setOnRecordListener(new OnRecordListener() {
            @SuppressLint("LogNotTimber")
            @Override
            public void onStart() {
                Log.d("RecordView", "onStart");

                if (checkRecordPermission2()) {
                    if (checkStoragePermission2()) {
                        //Start or stop recording
                        startRecordingService();
                    }
                }

                CookieBar.build(Activity13List.this)
                        .setTitle(getResources().getString(R.string.hold_button_to_record))
                        .setTitleColor(R.color.al131)
                        .setMessage(getResources().getString(R.string.hold_button_to_record2))
                        .setMessageColor(R.color.default_message_color)
                        .setIcon(R.drawable.recv_ic_mic_white)
                        .setBackgroundColor(R.color.al131313)
                        .setCookiePosition(Gravity.TOP)
                        .setAnimationIn(R.anim.slide_in_left, R.anim.slide_in_left)
                        .setAnimationOut(R.anim.slide_out_left, R.anim.slide_out_left)
                        .setDuration(3000)
                        .show();
            }

            @Override
            public void onCancel() {
                presenter.stopRecording();
                presenter.deleteActiveRecord();
            }

            @SuppressLint("LogNotTimber")
            @Override
            public void onFinish(long recordTime) {
                String time = getHumanTimeText(recordTime);
                new MaterialToast(context)
                        .setMessage(getResources().getString(R.string.recordtoast) + time)
                        .setIcon(R.drawable.time)
                        .setDuration(Toast.LENGTH_LONG)
                        .setBackgroundColor(getResources().getColor(R.color.shape13))
                        .show();
                Log.d("RecordView", "onFinish");
                Log.d("RecordTime", time);

                presenter.stopPlayback();
                presenter.stopRecording();

                startActivity(new Intent(context, MainRecActivity.class));

            }


            @SuppressLint("LogNotTimber")
            @Override
            public void onLessThanSecond() {
                Log.d("RecordView", "onLessThanSecond");
            }
        });


        recordView.setOnBasketAnimationEndListener(new OnBasketAnimationEnd() {
            @SuppressLint("LogNotTimber")
            @Override
            public void onAnimationEnd() {
                Log.d("RecordView", "Basket Animation Finished");
            }
        });

        kal = findViewById(R.id.kal); kal1 = findViewById(R.id.kal1); kal2 = findViewById(R.id.kal2);
        kal3 = findViewById(R.id.kal3); kal4 = findViewById(R.id.kal4); kal5 = findViewById(R.id.kal5);
        kal6 = findViewById(R.id.kal6); kal7 = findViewById(R.id.kal7); kal8 = findViewById(R.id.kal8);
        kal9 = findViewById(R.id.kal9); kal10 = findViewById(R.id.kal10);  badge = findViewById(R.id.badge);
        badge1 = findViewById(R.id.badge1); badge2 = findViewById(R.id.badge2); badge3 = findViewById(R.id.badge3);
        badge4 = findViewById(R.id.badge4); badge5 = findViewById(R.id.badge5); badge6 = findViewById(R.id.badge6);
        img1 = findViewById(R.id.img1); img2 = findViewById(R.id.img2); fab = findViewById(R.id.fab);

        new ClickShrinkEffect(kal); new ClickShrinkEffect(kal1);
        new ClickShrinkEffect(kal2); new ClickShrinkEffect(kal3);
        new ClickShrinkEffect(kal4); new ClickShrinkEffect(kal5);
        new ClickShrinkEffect(kal6); new ClickShrinkEffect(kal7);
        new ClickShrinkEffect(kal8); new ClickShrinkEffect(kal9);
        new ClickShrinkEffect(kal10); new ClickShrinkEffect(badge);
        new ClickShrinkEffect(badge1); new ClickShrinkEffect(badge2);
        new ClickShrinkEffect(badge3); new ClickShrinkEffect(badge4);
        new ClickShrinkEffect(badge5); new ClickShrinkEffect(badge6);
        new ClickShrinkEffect(img1); new ClickShrinkEffect(img2);
        new ClickShrinkEffect(fab);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        new MaterialToast(context)
                .setMessage(getResources().getString(R.string.bybyback))
                .setIcon(R.mipmap.ic_kaba1)
                .setDuration(Toast.LENGTH_SHORT)
                .setBackgroundColor(Color.parseColor("#62496F"))
                .show();

        m1.stop();m2.stop();m3.stop();backb.start();
    }
    @SuppressLint("DefaultLocale")
    private String getHumanTimeText(long milliseconds) {
        return String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(milliseconds),
                TimeUnit.MILLISECONDS.toSeconds(milliseconds) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds)));
    }
}