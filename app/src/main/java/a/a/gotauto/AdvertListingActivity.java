package a.a.gotauto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;

public class AdvertListingActivity extends AppCompatActivity {
  SavedMainMenuSelection savedMainMenuSelection = new SavedMainMenuSelection();

  private DatabaseReference dataBaseUrl;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_advert_listing);
    RecyclerView addList = findViewById(R.id.addlist);
    addList.setHasFixedSize(true);
    addList.setLayoutManager(new LinearLayoutManager(this));

    try{
      dataBaseUrl = FirebaseDatabase.getInstance().getReference().child("Adverts").push();
    }catch (Exception e)
    {
      Log.d("database error", "link with database not established");
    }

    FirebaseRecyclerAdapter<SavedMainMenuSelection, advertViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<SavedMainMenuSelection, advertViewHolder>(
        SavedMainMenuSelection.class,
        R.layout.listing_cell,
        advertViewHolder.class,
        dataBaseUrl
    ) {
      @Override
      protected void populateViewHolder(advertViewHolder viewHolder, SavedMainMenuSelection model, int position) {
        viewHolder.setPricelisting(savedMainMenuSelection.getPriceR());
        viewHolder.setYearlisting(savedMainMenuSelection.getCombinedYearR());



      }
    };
    addList.setAdapter(firebaseRecyclerAdapter);
  }


  public static class advertViewHolder extends RecyclerView.ViewHolder {
    public advertViewHolder(final View itemView) {
      super(itemView);
    }
    @Exclude
    public void setPricelisting(String priceR) {
      TextView listingPrice = itemView.findViewById(R.id.listingPrice);
      listingPrice.setText(priceR);
    }
    @Exclude
    public void setYearlisting(String combinedYearR) {
      TextView listingYear = itemView.findViewById(R.id.listingYear);
      listingYear.setText(combinedYearR);
    }
  }

}





