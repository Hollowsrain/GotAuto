package a.a.gotauto;

import a.a.gotauto.Fragments.BodyTypeFragment;
import a.a.gotauto.Fragments.FuelTypeFragment;
import a.a.gotauto.Fragments.MakerFragment;
import a.a.gotauto.Fragments.PriceFragment;
import a.a.gotauto.Fragments.YearFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  private Button makerButton;
  private Button fuelTypeButton;
  private Button bodyTypeButton;
  private Button priceButton;
  private Button yearButton;
  private TextView makerTextView;
  private TextView fuelTypeTextView;
  private TextView bodyTypeTextView;
  private TextView priceTextView;
  private TextView yearTextView;
  private Button searchButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
    Toolbar toolbar = findViewById(R.id.toolbar);
     setSupportActionBar(toolbar);

    makerButton = findViewById(R.id.makerButton);
    fuelTypeButton = findViewById(R.id.fuelTypeButton);
    bodyTypeButton = findViewById(R.id.bodyTypeButton);
    priceButton = findViewById(R.id.priceButton);
    yearButton = findViewById(R.id.yearButton);
    searchButton = findViewById(R.id.searchButton);

    makerTextView = findViewById(R.id.makerTextView);
    fuelTypeTextView = findViewById(R.id.fuelTypeTextView);
    bodyTypeTextView = findViewById(R.id.bodyTypeTextView);
    priceTextView = findViewById(R.id.priceTextView);
    yearTextView = findViewById(R.id.yearTextView);


    DrawerLayout drawer = findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);

    //////Button Listeners////////////////////////////////
    makerButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        MakerFragment makerFragment = new MakerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, makerFragment).commit();

      }
    });

    fuelTypeButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        FuelTypeFragment fuelTypeFragment = new FuelTypeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fuelTypeFragment).commit();
        setToHideElements();

      }
    });

    bodyTypeButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        BodyTypeFragment bodyTypeFragment = new BodyTypeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, bodyTypeFragment).commit();
        setToHideElements();

      }
    });

    priceButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        PriceFragment priceFragment = new PriceFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, priceFragment).commit();
        setToHideElements();
      }
    });

    yearButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        YearFragment yearFragment = new YearFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, yearFragment).commit();
        setToHideElements();

      }
    });

    searchButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(MainMenuActivity.this, AdvertListingActivity.class));
        /// more functions incoming...
      }
    });


    ////////////////////Button Listeners End/////////////////////////////////////

  }

  @Override
  protected void onResume() {
    super.onResume();

      this.retriveDataFromFragment();



  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);

  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main_menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.nav_camera) {
      startActivity(new Intent(MainMenuActivity.this, RegisterAdvertActivity.class));
    } else if (id == R.id.nav_gallery) {

    } else if (id == R.id.nav_slideshow) {

    } else if (id == R.id.nav_manage) {

    } else if (id == R.id.nav_share) {

    } else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }
  private void retriveDataFromFragment(){
    yearButton.setText(SavedMainMenuSelection.getCombinedYear());
    priceButton.setText(SavedMainMenuSelection.getPrice());
    fuelTypeButton.setText(SavedMainMenuSelection.getFuelType());
    bodyTypeButton.setText(SavedMainMenuSelection.getBodyType());


  }
  private void setToHideElements(){
    makerButton.setVisibility(View.GONE);
    fuelTypeButton.setVisibility(View.GONE);
    bodyTypeButton.setVisibility(View.GONE);
    priceButton.setVisibility(View.GONE);
    yearButton.setVisibility(View.GONE);
    makerTextView.setVisibility(View.GONE);
    fuelTypeTextView.setVisibility(View.GONE);
    bodyTypeTextView.setVisibility(View.GONE);
    priceTextView.setVisibility(View.GONE);
    yearTextView.setVisibility(View.GONE);
    }



}


