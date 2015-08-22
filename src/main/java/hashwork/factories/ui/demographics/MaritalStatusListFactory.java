package hashwork.factories.ui.demographics;

import hashwork.domain.ui.demographics.MaritalStatusList;

/**
 * Created by zamzam on 15/08/22.
 */
public class MaritalStatusListFactory {
    public static MaritalStatusList getMaritalStatusList(String statusName){
        MaritalStatusList maritalStatusList = new MaritalStatusList.Builder()
                .statusName(statusName).build();
        return maritalStatusList;
    }
}
