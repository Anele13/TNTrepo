// Generated by view binder compiler. Do not edit!
package com.example.clase2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.clase2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout LinearLayout1;

  @NonNull
  public final ConstraintLayout LinearLayout2;

  @NonNull
  public final ImageView fosforo1;

  @NonNull
  public final ImageView fosforo2;

  @NonNull
  public final ImageView fosforo3;

  @NonNull
  public final ImageView fosforo4;

  @NonNull
  public final ImageView fosforo5;

  @NonNull
  public final ImageView fosforo6;

  @NonNull
  public final ImageView fosforo7;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView1;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView6;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout LinearLayout1, @NonNull ConstraintLayout LinearLayout2,
      @NonNull ImageView fosforo1, @NonNull ImageView fosforo2, @NonNull ImageView fosforo3,
      @NonNull ImageView fosforo4, @NonNull ImageView fosforo5, @NonNull ImageView fosforo6,
      @NonNull ImageView fosforo7, @NonNull ImageView imageView, @NonNull ImageView imageView1,
      @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView6,
      @NonNull ImageView imageView7, @NonNull TextView textView, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.LinearLayout1 = LinearLayout1;
    this.LinearLayout2 = LinearLayout2;
    this.fosforo1 = fosforo1;
    this.fosforo2 = fosforo2;
    this.fosforo3 = fosforo3;
    this.fosforo4 = fosforo4;
    this.fosforo5 = fosforo5;
    this.fosforo6 = fosforo6;
    this.fosforo7 = fosforo7;
    this.imageView = imageView;
    this.imageView1 = imageView1;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ConstraintLayout LinearLayout1 = rootView.findViewById(R.id.LinearLayout1);
      if (LinearLayout1 == null) {
        missingId = "LinearLayout1";
        break missingId;
      }
      ConstraintLayout LinearLayout2 = rootView.findViewById(R.id.LinearLayout2);
      if (LinearLayout2 == null) {
        missingId = "LinearLayout2";
        break missingId;
      }
      ImageView fosforo1 = rootView.findViewById(R.id.fosforo1);
      if (fosforo1 == null) {
        missingId = "fosforo1";
        break missingId;
      }
      ImageView fosforo2 = rootView.findViewById(R.id.fosforo2);
      if (fosforo2 == null) {
        missingId = "fosforo2";
        break missingId;
      }
      ImageView fosforo3 = rootView.findViewById(R.id.fosforo3);
      if (fosforo3 == null) {
        missingId = "fosforo3";
        break missingId;
      }
      ImageView fosforo4 = rootView.findViewById(R.id.fosforo4);
      if (fosforo4 == null) {
        missingId = "fosforo4";
        break missingId;
      }
      ImageView fosforo5 = rootView.findViewById(R.id.fosforo5);
      if (fosforo5 == null) {
        missingId = "fosforo5";
        break missingId;
      }
      ImageView fosforo6 = rootView.findViewById(R.id.fosforo6);
      if (fosforo6 == null) {
        missingId = "fosforo6";
        break missingId;
      }
      ImageView fosforo7 = rootView.findViewById(R.id.fosforo7);
      if (fosforo7 == null) {
        missingId = "fosforo7";
        break missingId;
      }
      ImageView imageView = rootView.findViewById(R.id.imageView);
      if (imageView == null) {
        missingId = "imageView";
        break missingId;
      }
      ImageView imageView1 = rootView.findViewById(R.id.imageView1);
      if (imageView1 == null) {
        missingId = "imageView1";
        break missingId;
      }
      ImageView imageView2 = rootView.findViewById(R.id.imageView2);
      if (imageView2 == null) {
        missingId = "imageView2";
        break missingId;
      }
      ImageView imageView3 = rootView.findViewById(R.id.imageView3);
      if (imageView3 == null) {
        missingId = "imageView3";
        break missingId;
      }
      ImageView imageView6 = rootView.findViewById(R.id.imageView6);
      if (imageView6 == null) {
        missingId = "imageView6";
        break missingId;
      }
      ImageView imageView7 = rootView.findViewById(R.id.imageView7);
      if (imageView7 == null) {
        missingId = "imageView7";
        break missingId;
      }
      TextView textView = rootView.findViewById(R.id.textView);
      if (textView == null) {
        missingId = "textView";
        break missingId;
      }
      TextView textView2 = rootView.findViewById(R.id.textView2);
      if (textView2 == null) {
        missingId = "textView2";
        break missingId;
      }
      TextView textView3 = rootView.findViewById(R.id.textView3);
      if (textView3 == null) {
        missingId = "textView3";
        break missingId;
      }
      TextView textView6 = rootView.findViewById(R.id.textView6);
      if (textView6 == null) {
        missingId = "textView6";
        break missingId;
      }
      return new ActivityMainBinding((ConstraintLayout) rootView, LinearLayout1, LinearLayout2,
          fosforo1, fosforo2, fosforo3, fosforo4, fosforo5, fosforo6, fosforo7, imageView,
          imageView1, imageView2, imageView3, imageView6, imageView7, textView, textView2,
          textView3, textView6);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}