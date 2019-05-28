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


public class PriceFragment extends Fragment {

  public PriceFragment() {
      //Required for Fragment
  }



  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {


      View view = inflater.inflate(R.layout.fragment_price_fragmant, container, false);

    final String priceRangeListFrom[] = new String[]{"", "500", "750", "1000", "1250", "1500", "1750", "2000",
        "2500", "3000", "3500"
        , "4000", "4500", "5000", "5500", "6000", "7000", "8000", "9000", "10000"};

    final ListView priceList = view.findViewById(R.id.priceList);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        getActivity(),
        android.R.layout.simple_list_item_1,
        priceRangeListFrom
    );
    priceList.setAdapter(adapter);

    priceList.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getActivity().getBaseContext(), MainMenuActivity.class);
        String priceFrom = priceRangeListFrom[i].toString();
        SavedMainMenuSelection.setPrice(priceFrom);
        getActivity().startActivity(intent);



      }
    });




/*
intent.putExtra("PriceData", finalPriceRangeListFrom.get(i));
    ListView listRangeFrom = view.findViewById(android.R.id.list);

    ArrayList<String> priceRangeListFrom = new ArrayList<>();
    ArrayAdapter<String> adapter = new ArrayAdapter<>(
        getContext(),
        android.R.layout.simple_list_item_1,
        priceRangeListFrom
    );



    final ArrayList<String> finalPriceRangeListFrom = priceRangeListFrom;

    Log.e("1", "2");

    priceRangeListFrom = new ArrayList<>();
    priceRangeListFrom.add("150");
    priceRangeListFrom.add("300");
    priceRangeListFrom.add("500");
    priceRangeListFrom.add("750");
    priceRangeListFrom.add("1000");
    priceRangeListFrom.add("1250");
    priceRangeListFrom.add("1500");
    priceRangeListFrom.add("1750");
    priceRangeListFrom.add("2000");
    priceRangeListFrom.add("2500");
    priceRangeListFrom.add("3000");
    priceRangeListFrom.add("3500");
    priceRangeListFrom.add("4000");
    priceRangeListFrom.add("4500");
    priceRangeListFrom.add("5000");
    priceRangeListFrom.add("5500");
    priceRangeListFrom.add("6000");
    priceRangeListFrom.add("6500");
    priceRangeListFrom.add("7000");
    priceRangeListFrom.add("8000");
    priceRangeListFrom.add("9000");
    priceRangeListFrom.add("10,000");
    priceRangeListFrom.add("12,000");

    listRangeFrom.setAdapter(adapter);

    listRangeFrom.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




      }
    });
*/

    return view;

  }


}

