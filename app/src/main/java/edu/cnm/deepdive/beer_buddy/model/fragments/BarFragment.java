package edu.cnm.deepdive.beer_buddy.model.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import edu.cnm.deepdive.beer_buddy.R;
import edu.cnm.deepdive.beer_buddy.model.viewModel.BarViewModel;

public class BarFragment extends Fragment {

  private Context context;

  public BarFragment(){
    // Required to have an empty public constructor
  }

  @Override
  public void onAttach(@NonNull Context context) {
    super.onAttach(context);
    this.context = context;
  }


  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {

    final View view = inflater.inflate(R.layout.fragment_bar, container, false);

    final BarViewModel viewModel = ViewModelProviders.of(this).get(BarViewModel.class);
    return super.onCreateView(inflater, container, savedInstanceState);
  }
}
