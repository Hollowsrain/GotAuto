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

public class RegBodyType extends Fragment {
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();

  public RegBodyType() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {


    View view = inflater.inflate(R.layout.fragment_reg_body_type, container, false);

    final String bodyTypeSelection[] = new String[]{"Sedan", "Hatchback", "Estate", "Coupe", "SUV", "Off-Road", "ETC"};

    final ListView bodyTypeList = view.findViewById(R.id.bodyTypeListR);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        bodyTypeSelection
    );
    bodyTypeList.setAdapter(adapter);

    bodyTypeList.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), RegisterAdvertActivity.class);
        String bodyTypeR = bodyTypeSelection[i];
        SavedMainMenuSelection.setBodyTypeR(bodyTypeR);
        getActivity().startActivity(intent);



      }
    });
    return view;
  }

}
