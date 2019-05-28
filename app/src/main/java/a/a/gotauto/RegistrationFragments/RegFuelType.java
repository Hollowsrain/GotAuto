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

public class RegFuelType extends Fragment {
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();

  public RegFuelType() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_reg_fuel_type, container, false);

    final String fuelTypeSelection[] = new String[]{"Diesel", "Petrol", "Petrol/LPG", "Electric"};

    final ListView fuelTypeList = view.findViewById(R.id.fuelTypeListR);

    ArrayAdapter<String> adapter = new ArrayAdapter<>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        fuelTypeSelection
    );
    fuelTypeList.setAdapter(adapter);

    fuelTypeList.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String fuelTypeR = fuelTypeSelection[i].toString();
        SavedMainMenuSelection.setFuelTypeR(fuelTypeR);
        getActivity().startActivity(intent);



      }
    });

    return view;
  }

}
