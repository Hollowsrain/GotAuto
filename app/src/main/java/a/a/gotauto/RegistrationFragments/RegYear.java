package a.a.gotauto.RegistrationFragments;

import a.a.gotauto.R;
import a.a.gotauto.RegisterAdvertActivity;
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


public class RegYear extends Fragment {
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();

  public String combinedYear;

  public RegYear() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_reg_year, container, false);

    final String yearList[] = new String[]{"2019", "2018", "2017", "2016", "2015", "2014", "2013",
        "2012", "2011", "2010", "2009", "2008"};
    final String monthList[] = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

    final ListView yearStartListView = view.findViewById(R.id.yearList);
    final ListView yearEndListView = view.findViewById(R.id.monthList);

    ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        yearList
    );
    ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        monthList
    );
    yearStartListView.setAdapter(yearAdapter);
    yearEndListView.setAdapter(monthAdapter);

    yearStartListView.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String yearFrom = yearList[i].toString();
        int yearInt = Integer.valueOf(yearFrom);

        if (combinedYear != null) {
          int CY = Integer.valueOf(combinedYear);
          if (CY > yearInt && CY < 13) {
            combinedYear = yearFrom + "/" + combinedYear;
            SavedMainMenuSelection.setCombinedYearR(combinedYear);
            getActivity().startActivity(intent);
          } else {
            Toast.makeText(getContext(),
                "Please pick the Year and month of the car.",
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
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String month = monthList[i];
        if (combinedYear != null) {
          combinedYear = combinedYear + "/" + month;
          SavedMainMenuSelection.setCombinedYearR(combinedYear);
          getActivity().startActivity(intent);
        } else {
          combinedYear = null;
          combinedYear = month;
        }


      }
    });
    return view;
  }

}
