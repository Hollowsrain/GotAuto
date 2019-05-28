package a.a.gotauto.Fragments;

import a.a.gotauto.MainMenuActivity;
import a.a.gotauto.R;
import a.a.gotauto.SavedMainMenuSelection;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class YearFragment extends Fragment {

  public String combinedYear;


  public YearFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    String yearFrom;
    String yearTo;

    View view = inflater.inflate(R.layout.fragment_year, container, false);

    final String yearList[] = new String[]{"","2019", "2018", "2017", "2016", "2015", "2014", "2013",
        "2012", "2011", "2010", "2009", "2008"};

    final ListView yearStartListView = view.findViewById(R.id.yearStartListView);
    final ListView yearEndListView = view.findViewById(R.id.yearEndListView);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        yearList
    );
    yearStartListView.setAdapter(adapter);
    yearEndListView.setAdapter(adapter);

    yearStartListView.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), MainMenuActivity.class);
        String yearFrom = yearList[i].toString();
        int yearFint = Integer.valueOf(yearFrom);

        if (combinedYear != null) {
          int CY = Integer.valueOf(combinedYear);
          if (CY < yearFint) {
            combinedYear = combinedYear + " " + yearFrom;
            SavedMainMenuSelection.setCombinedYear(combinedYear);
            getActivity().startActivity(intent);
          } else {
            Toast.makeText(getContext(),
                "The year from value you selected is less than the year to value",
                Toast.LENGTH_LONG).show();
            combinedYear = null;
          }

        } else {

          combinedYear = yearFrom;
        }


      }


    });
    yearEndListView.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), MainMenuActivity.class);
        String yearTo = yearList[i].toString();
        int yearTint = Integer.valueOf(yearTo);
        if (combinedYear != null) {
          combinedYear = combinedYear + " " + yearTo;
          SavedMainMenuSelection.setCombinedYear(combinedYear);
          getActivity().startActivity(intent);
        } else {
          combinedYear = null;
          combinedYear = yearTo;
        }


      }
    });
    return view;
  }

}
