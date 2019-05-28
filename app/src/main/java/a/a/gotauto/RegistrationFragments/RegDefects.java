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

public class RegDefects extends Fragment {
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();

  public RegDefects() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_reg_defects, container, false);
    final String DefectsList[] = new String[]{"No Defects", "Collision", "Burned", "Gearbox fault", "Engine fault", "Flooded", "Hail", "Other"};

    final ListView defects = view.findViewById(R.id.defectsR);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        DefectsList
    );
    defects.setAdapter(adapter);

    defects.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String DefectsR = DefectsList[i];
        SavedMainMenuSelection.setDefectsR(DefectsR);
        getActivity().startActivity(intent);

      }

    });
    return view;
  }

}
