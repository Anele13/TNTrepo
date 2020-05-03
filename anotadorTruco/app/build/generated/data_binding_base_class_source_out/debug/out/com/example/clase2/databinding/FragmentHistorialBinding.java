// Generated by view binder compiler. Do not edit!
package com.example.clase2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.clase2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistorialBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RecyclerView rvResultadoList;

  private FragmentHistorialBinding(@NonNull FrameLayout rootView,
      @NonNull RecyclerView rvResultadoList) {
    this.rootView = rootView;
    this.rvResultadoList = rvResultadoList;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistorialBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistorialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_historial, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistorialBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      RecyclerView rvResultadoList = rootView.findViewById(R.id.rv_resultado_list);
      if (rvResultadoList == null) {
        missingId = "rvResultadoList";
        break missingId;
      }
      return new FragmentHistorialBinding((FrameLayout) rootView, rvResultadoList);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
