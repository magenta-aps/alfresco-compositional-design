package dk.magenta.alfresco.platformsample.modelstrategies;

import dk.magenta.alfresco.platformsample.AppInfoWebscript;
import dk.magenta.alfresco.platformsample.model.AppInfoModelB;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component("ModelStrateyB")
public class ModelBStrategy implements ModelStrategy {

    @Override
    public Object getAppInfoModel(AppInfoWebscript appInfoWebscript) {

        Map<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Home", "12345678");
        phoneNumbers.put("Office", "87654321");

        return new AppInfoModelB(appInfoWebscript.getCompanyName(), "6.5.2", phoneNumbers);
    }

}
