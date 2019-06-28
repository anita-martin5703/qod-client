package edu.cnm.deepdive.beer_buddy.model.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import edu.cnm.deepdive.beer_buddy.R;
import edu.cnm.deepdive.beer_buddy.model.entities.Bar;
import edu.cnm.deepdive.beer_buddy.model.viewModel.BarViewModel;
import java.util.List;

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
    final ListView barListView = view.findViewById(R.id.bar_list);
    final BarViewModel viewModel = ViewModelProviders.of(this).get(BarViewModel.class);

    viewModel.getBarsLiveData().observe(this, new Observer<List<Bar>>() {
      @Override
      public void onChanged(List<Bar> barList) {
        final ArrayAdapter<Bar> adapter = new ArrayAdapter<Bar>(context, android.R.layout.simple_list_item_1,
            barList);
        barListView.setAdapter(adapter);
        barListView.setOnItemClickListener(new OnItemLongClickListener() {
          @Override
          public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
            BarFragmentDirections.
            return false;
          }
        });
      }
    });
  }
}
