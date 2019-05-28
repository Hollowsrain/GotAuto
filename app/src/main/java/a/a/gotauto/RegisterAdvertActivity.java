package a.a.gotauto;

import a.a.gotauto.RegistrationFragments.RegBodyType;
import a.a.gotauto.RegistrationFragments.RegDefects;
import a.a.gotauto.RegistrationFragments.RegDoorCount;
import a.a.gotauto.RegistrationFragments.RegDrivingWheels;
import a.a.gotauto.RegistrationFragments.RegFuelType;
import a.a.gotauto.RegistrationFragments.RegGearbox;
import a.a.gotauto.RegistrationFragments.RegMaker;
import a.a.gotauto.RegistrationFragments.RegSeating;
import a.a.gotauto.RegistrationFragments.RegSteeringWheel;
import a.a.gotauto.RegistrationFragments.RegYear;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterAdvertActivity extends AppCompatActivity {

  private DatabaseReference dataBaseUrl;
  private Button buttonMaker;
  private Button buttonFuelType;
  private Button buttonBodyType;
  private Button buttonYear;
  private EditText price;
  private Button buttonGearBox;
  private Button buttonDoorCount;
  private EditText displacement;
  private Button buttonSteeringWheel;
  private Button buttonDefects;
  private EditText etOdometer;
  private EditText etPowerKW;
  private Button buttonDrivingWheels;
  private Button buttonSeating;
  private EditText etFuelConsumption;
  final SavedMainMenuSelection SavedMainMenuSelection = new SavedMainMenuSelection();

  @SuppressLint("ClickableViewAccessibility")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    DatabaseReference databaseRef = FirebaseDatabase.getInstance()
        .getReferenceFromUrl("https://gotauto-d883a.firebaseio.com/");
      dataBaseUrl = databaseRef.child("Adverts").push();

    setContentView(R.layout.activity_register_advert);
    LinearLayout LLRight = findViewById(R.id.LinearLayoutRight);
    LinearLayout LLLeft = findViewById(R.id.LinearLayoutLeft);

    UserInterfaceUtilities UIHelper = new UserInterfaceUtilities(this);







    Button button;
    button = UIHelper.generateButtonWT(R.string.maker);
    LLLeft.addView(button);

    buttonMaker = UIHelper.generateButton(R.string.maker);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegMaker makerFragment = new RegMaker();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, makerFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonMaker);

    button = UIHelper.generateButtonWT(R.string.fuel_type);
    LLLeft.addView(button);

    buttonFuelType = UIHelper.generateButton(R.string.fuel_type);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegFuelType fuelTypeFragment = new RegFuelType();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fuelTypeFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonFuelType);

    button = UIHelper.generateButtonWT(R.string.body_type);
    LLLeft.addView(button);

    buttonBodyType = UIHelper.generateButton(R.string.body_type);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegBodyType bodyTypeFragment = new RegBodyType();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, bodyTypeFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonBodyType);

    button = UIHelper.generateButtonWT(R.string.year);
    LLLeft.addView(button);

    buttonYear = UIHelper.generateButton(R.string.year);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegYear yearFragment = new RegYear();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, yearFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonYear);

    button = UIHelper.generateButtonWT(R.string.price);
    LLLeft.addView(button);

    price = UIHelper.generateEditText();
    price.setHint("Price €");
    LLRight.addView(price);
    price.setOnTouchListener(new OnTouchListener() {
      @Override
      public boolean onTouch(View view, MotionEvent motionEvent) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        return false;
      }
    });
    button = UIHelper.generateButtonWT(R.string.gearBox);
    LLLeft.addView(button);

    buttonGearBox = UIHelper.generateButton(R.string.gearBox);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegGearbox gearboxFragment = new RegGearbox();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, gearboxFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());

      }
    });
    LLRight.addView(buttonGearBox);

    button = UIHelper.generateButtonWT(R.string.doorCount);
    LLLeft.addView(button);

    buttonDoorCount = UIHelper.generateButton(R.string.doorCount);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegDoorCount doorCountFragment = new RegDoorCount();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, doorCountFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonDoorCount);

    button = UIHelper.generateButtonWT(R.string.displacement);
    LLLeft.addView(button);

    displacement = UIHelper.generateEditText();
    LLRight.addView(displacement);
    displacement.setOnTouchListener(new OnTouchListener() {
      @Override
      public boolean onTouch(View view, MotionEvent motionEvent) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        return false;
      }
    });

    button = UIHelper.generateButtonWT(R.string.steeringWheel);
    LLLeft.addView(button);

    buttonSteeringWheel = UIHelper.generateButton(R.string.steeringWheel);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegSteeringWheel steeringWheelFragment = new RegSteeringWheel();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, steeringWheelFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonSteeringWheel);

    button = UIHelper.generateButtonWT(R.string.defects);
    LLLeft.addView(button);

    buttonDefects = UIHelper.generateButton(R.string.defects);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegDefects defectsFragment = new RegDefects();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, defectsFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonDefects);

    button = UIHelper.generateButtonWT(R.string.odometer);
    LLLeft.addView(button);

    etOdometer = UIHelper.generateEditText();
    LLRight.addView(etOdometer);
    etOdometer.setOnTouchListener(new OnTouchListener() {
      @Override
      public boolean onTouch(View view, MotionEvent motionEvent) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        return false;
      }
    });

    button = UIHelper.generateButtonWT(R.string.power);
    LLLeft.addView(button);

    etPowerKW = UIHelper.generateEditText();
    LLRight.addView(etPowerKW);
    etPowerKW.setOnTouchListener(new OnTouchListener() {
      @Override
      public boolean onTouch(View view, MotionEvent motionEvent) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        return false;
      }
    });

    button =  UIHelper.generateButtonWT(R.string.drivingWheels);
    LLLeft.addView(button);

    buttonDrivingWheels = UIHelper.generateButton(R.string.drivingWheels);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegDrivingWheels drivingWheelsFragment = new RegDrivingWheels();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, drivingWheelsFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonDrivingWheels);

    button = UIHelper.generateButtonWT(R.string.seating);
    LLLeft.addView(button);

    buttonSeating = UIHelper.generateButton(R.string.seating);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        RegSeating seatingFragment = new RegSeating();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, seatingFragment).commit();
        SavedMainMenuSelection.setPriceR(price.getText().toString());
        SavedMainMenuSelection.setDisplacementR(displacement.getText().toString());
        SavedMainMenuSelection.setOdometerR(etOdometer.getText().toString());
        SavedMainMenuSelection.setPowerKWR(etPowerKW.getText().toString());
        SavedMainMenuSelection.setFuelConsumptionR(etFuelConsumption.getText().toString());
      }
    });
    LLRight.addView(buttonSeating);

    button = UIHelper.generateButtonWT(R.string.fuelConsumption);
    LLLeft.addView(button);

    etFuelConsumption = UIHelper.generateEditText();
    LLRight.addView(etFuelConsumption);
    etFuelConsumption.setOnTouchListener(new OnTouchListener() {
      @Override
      public boolean onTouch(View view, MotionEvent motionEvent) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        return false;
      }
    });


    final Button submitAdvert = findViewById(R.id.submitAdvert);
    submitAdvert.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        submitRegistration();
      }
    });
    //////////////////////////////////End of Click Listeners//////////////////////////////


    }
  @Override
  protected void onResume() {
    super.onResume();
    this.retriveDataFromFragment();
  }
  private void retriveDataFromFragment(){
    buttonFuelType.setText(SavedMainMenuSelection.getFuelTypeR());
    buttonBodyType.setText(SavedMainMenuSelection.getBodyTypeR());
    buttonYear.setText(SavedMainMenuSelection.getCombinedYearR());
    price.setText(SavedMainMenuSelection.getPriceR());
    buttonGearBox.setText(SavedMainMenuSelection.getGearboxR());
    buttonDoorCount.setText(SavedMainMenuSelection.getDoorCountR());
    displacement.setText(SavedMainMenuSelection.getDisplacementR());
    buttonSteeringWheel.setText(SavedMainMenuSelection.getSteeringWheelR());
    buttonDefects.setText(SavedMainMenuSelection.getDefectsR());
    etOdometer.setText(SavedMainMenuSelection.getOdometerR());
    etPowerKW.setText(SavedMainMenuSelection.getPowerKWR());
    buttonDrivingWheels.setText(SavedMainMenuSelection.getDrivingWheelsR());
    buttonSeating.setText(SavedMainMenuSelection.getSeatingR());
    etFuelConsumption.setText(SavedMainMenuSelection.getFuelConsumptionR());
    }

    private void submitRegistration(){
    DatabaseReference fuelType = dataBaseUrl.child("FuelType");
    fuelType.setValue(SavedMainMenuSelection.getFuelTypeR());

    DatabaseReference bodyType = dataBaseUrl.child("BodyType");
    bodyType.setValue(SavedMainMenuSelection.getBodyTypeR());

    DatabaseReference year = dataBaseUrl.child("Year");
    year.setValue(SavedMainMenuSelection.getCombinedYearR());

    DatabaseReference price = dataBaseUrl.child("Price");
    price.setValue(SavedMainMenuSelection.getPriceR());

    DatabaseReference gearBox = dataBaseUrl.child("GearBox");
    gearBox.setValue(SavedMainMenuSelection.getGearboxR());

    DatabaseReference doorCount = dataBaseUrl.child("DoorCount");
    doorCount.setValue(SavedMainMenuSelection.getDoorCountR());

    DatabaseReference displacement = dataBaseUrl.child("Displacement");
    displacement.setValue(SavedMainMenuSelection.getDisplacementR());

    DatabaseReference steeringWheel = dataBaseUrl.child("SteeringWheel");
    steeringWheel.setValue(SavedMainMenuSelection.getSteeringWheelR());

    DatabaseReference defects = dataBaseUrl.child("Defects");
    defects.setValue(SavedMainMenuSelection.getDefectsR());

    DatabaseReference odometer = dataBaseUrl.child("Odometer");
    odometer.setValue(SavedMainMenuSelection.getOdometerR());

    DatabaseReference powerKW = dataBaseUrl.child("Power_KW");
    powerKW.setValue(SavedMainMenuSelection.getPowerKWR());

    DatabaseReference drivingWheels = dataBaseUrl.child("DrivingWheels");
    drivingWheels.setValue(SavedMainMenuSelection.getDrivingWheelsR());

    DatabaseReference seating = dataBaseUrl.child("SeatingR");
    seating.setValue(SavedMainMenuSelection.getSeatingR());

    DatabaseReference consumption = dataBaseUrl.child("Consumption");
    consumption.setValue(SavedMainMenuSelection.getFuelConsumptionR());

    startActivity(new Intent(RegisterAdvertActivity.this, MainMenuActivity.class));

    }



  }
