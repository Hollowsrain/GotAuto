package a.a.gotauto;


import com.google.firebase.database.Exclude;

public class SavedMainMenuSelection{


  @Exclude public static String combinedYear;
  @Exclude public static String price;
  @Exclude public static String fuelType;
  @Exclude public static String bodyType;
  //////////Start of Main menu get/set//////////////////////////////////////////////

  public static String getFuelType() {
    return fuelType;
  }

  public static void setFuelType(String fuelType) {
    SavedMainMenuSelection.fuelType = fuelType;
  }

  public static String getBodyType() {
    return bodyType;
  }

  public static void setBodyType(String bodyType) {
    SavedMainMenuSelection.bodyType = bodyType;
  }

  public static String getPrice() {
    return price;
  }

  public static void setPrice(String price) {
    SavedMainMenuSelection.price = price;
  }

  public static String getCombinedYear() {
    return combinedYear;
  }

  public static void setCombinedYear(String combinedYear) {
    SavedMainMenuSelection.combinedYear = combinedYear;
  }

  /////////////////////////End Of Main Menu get/set//////////////////////////////////////////


   private static String fuelTypeR;
   private static String bodyTypeR;
   private  String combinedYearR;
   private  String priceR;
   private static String gearboxR;
   private static String doorCountR;
   private static String displacementR;
   public static String steeringWheelR;
   public static String defectsR;
   private static String odometerR;
   private static String powerKWR;
   public static String drivingWheelsR;
   public static String seatingR;
   private static String fuelConsumptionR;

  public  String getDrivingWheelsR() {
    return drivingWheelsR;
  }

  public  void setDrivingWheelsR(String drivingWheelsR) {
    SavedMainMenuSelection.drivingWheelsR = drivingWheelsR;
  }

  public  String getSeatingR() {
    return seatingR;
  }

  public  void setSeatingR(String seatingR) {
    SavedMainMenuSelection.seatingR = seatingR;
  }

  public  String getFuelConsumptionR() {
    return fuelConsumptionR;
  }

  public  void setFuelConsumptionR(String fuelConsumptionR) {
    SavedMainMenuSelection.fuelConsumptionR = fuelConsumptionR;
  }

  public  String getPowerKWR() {

    return powerKWR;
  }

  public  void setPowerKWR(String powerKWR) {
    SavedMainMenuSelection.powerKWR = powerKWR;
  }

  public  String getOdometerR() {
    return odometerR;
  }

  public  void setOdometerR(String odometerR) {
    SavedMainMenuSelection.odometerR = odometerR;
  }

  public  String getDefectsR() {
    return defectsR;
  }

  public  void setDefectsR(String defectsR) {
    SavedMainMenuSelection.defectsR = defectsR;
  }


  public  String getSteeringWheelR() {
    return SavedMainMenuSelection.steeringWheelR;
  }

  public  void setSteeringWheelR(String steeringWheelR) {
    SavedMainMenuSelection.steeringWheelR = steeringWheelR;
  }

  public  String getDisplacementR() {
    return displacementR;
  }

  public  void setDisplacementR(String displacementR) {
    SavedMainMenuSelection.displacementR = displacementR;
  }

  public  String getDoorCountR() {
    return doorCountR;
  }

  public  void setDoorCountR(String doorCountR) {
    SavedMainMenuSelection.doorCountR = doorCountR;
  }

  public  String getGearboxR() {
    return gearboxR;
  }

  public  void setGearboxR(String gearboxR) {
    SavedMainMenuSelection.gearboxR = gearboxR;
  }

  public  String getFuelTypeR() {
    return fuelTypeR;
  }

  public  void setFuelTypeR(String fuelTypeR) {
    SavedMainMenuSelection.fuelTypeR = fuelTypeR;
  }

  public  String getBodyTypeR() {
    return bodyTypeR;
  }

  public  void setBodyTypeR(String bodyTypeR) {
    SavedMainMenuSelection.bodyTypeR = bodyTypeR;
  }

  public String getCombinedYearR() {
    return combinedYearR;
  }

  public  void setCombinedYearR(String combinedYearr) {
    combinedYearR = combinedYearr;
  }
  public  void setPriceR(String pricer) {
    priceR = pricer;
  }
  public  String getPriceR() {
    return priceR;
  }

  public SavedMainMenuSelection(String pricer, String combinedYearr){
    this.combinedYearR = combinedYearr;
    this.priceR = pricer;
  }

}
