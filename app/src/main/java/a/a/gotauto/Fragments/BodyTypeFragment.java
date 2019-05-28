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


public class BodyTypeFragment extends Fragment {

  public BodyTypeFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {


    View view = inflater.inflate(R.layout.fragment_body_type, container, false);

    final String bodyTypeSelection[] = new String[]{"","Sedan", "Hatchback", "Estate", "Coupe", "SUV", "Off-Road", "ETC"};

    final ListView bodyTypeList = view.findViewById(R.id.bodyTypeList);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        bodyTypeSelection
    );
    bodyTypeList.setAdapter(adapter);

    bodyTypeList.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), MainMenuActivity.class);
        String bodyType = bodyTypeSelection[i].toString();
        SavedMainMenuSelection.setBodyType(bodyType);
        getActivity().startActivity(intent);



      }
    });
    return view;
  }


}
