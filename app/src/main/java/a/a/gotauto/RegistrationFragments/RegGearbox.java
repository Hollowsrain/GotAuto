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

public class RegGearbox extends Fragment {
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();

  public RegGearbox() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_reg_gearbox, container, false);

    final String GearBoxSelection[] = new String[]{"Manual", "Automatic"};

    final ListView gearboxList = view.findViewById(R.id.gearboxListR);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        GearBoxSelection
    );
    gearboxList.setAdapter(adapter);

    gearboxList.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String GearboxR = GearBoxSelection[i];
        SavedMainMenuSelection.setGearboxR(GearboxR);
        getActivity().startActivity(intent);

  }

});
    return view;
  }
}