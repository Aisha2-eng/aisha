package acceptTest;

import java.util.ArrayList;
import java.util.List;

public class HousingDetails {

    public List<HousingUnit> housingUnits;

    public HousingDetails() {
        housingUnits = new ArrayList<>();
        // Assuming some initial data for housingUnits
        housingUnits.add(new HousingUnit("Apartment 1", "Rafidia Street, Nablus" ,  "$150 " , "Furnished, Wi-Fi, Laundry" ));
        housingUnits.add(new HousingUnit("Villa 5", "Al-Manara, Ramallah"  ,  " $120 " , "Unfurnished, Parking"   ));
        housingUnits.add(new HousingUnit("House 2", "Old City, Jerusalem " ,  "$200 ", "Garden, 24/7 Security" ));
        // Add more housing units as needed
    }

    public HousingUnit findHousingUnitByLocation(String location) {
        for (HousingUnit unit : housingUnits) {
            if (unit.location.equalsIgnoreCase(location)) {
                return unit;
            }
        }
        return null;  // Handle if housing unit is not found
    }

    public static class HousingUnit {
        public String name;
        public String location;
      
        public String monthlyRent;
        public String services;

        public HousingUnit(String name, String location, String monthlyRent, String services) {
            this.name = name;
            this.location = location;
            
            this.monthlyRent = monthlyRent;
            this.services = services;
        }
    }
}
