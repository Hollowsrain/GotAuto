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

public class FuelTypeFragment extends Fragment {

  public FuelTypeFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {


    View view = inflater.inflate(R.layout.fragment_fuel_type, container, false);

    final String fuelTypeSelection[] = new String[]{"","Diesel", "Petrol", "Petrol/LPG", "Electric"};

    final ListView fuelTypeList = view.findViewById(R.id.fuelTypeList);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        fuelTypeSelection
    );
    fuelTypeList.setAdapter(adapter);

    fuelTypeList.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), MainMenuActivity.class);
        String fuelType = fuelTypeSelection[i].toString();
        SavedMainMenuSelection.setFuelType(fuelType);
        getActivity().startActivity(intent);



      }
    });

    return view;
  }

}
