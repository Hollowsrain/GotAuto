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

public class RegDrivingWheels extends Fragment {
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();
  public RegDrivingWheels() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_reg_driving_wheels, container, false);
    final String DrivingWheelsList[] = new String[]{"Front-Wheels", "Rear-Wheels", "4x4", "All-Wheel-Drive"};

    final ListView drivingWheels = view.findViewById(R.id.drivingWheelsR);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        DrivingWheelsList
    );
    drivingWheels.setAdapter(adapter);

    drivingWheels.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String drivingWheelsR = DrivingWheelsList[i];
        SavedMainMenuSelection.setDrivingWheelsR(drivingWheelsR);
        getActivity().startActivity(intent);

      }

    });
    return view;
  }

}
