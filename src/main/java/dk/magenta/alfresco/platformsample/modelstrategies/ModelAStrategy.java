package dk.magenta.alfresco.platformsample.modelstrategies;

import dk.magenta.alfresco.platformsample.AppInfoWebscript;
import dk.magenta.alfresco.platformsample.model.AppInfoModelA;
import org.springframework.stereotype.Component;

@Component("ModelStrateyA")
public class ModelAStrategy implements ModelStrategy {

    @Override
    public Object getAppInfoModel(AppInfoWebscript appInfoWebscript) {
        return new AppInfoModelA(appInfoWebscript.getCompanyName(), "1.0.0");
    }

}
