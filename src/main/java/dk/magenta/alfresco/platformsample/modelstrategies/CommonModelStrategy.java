package dk.magenta.alfresco.platformsample.modelstrategies;

import dk.magenta.alfresco.platformsample.AppInfoWebscript;
import org.alfresco.error.AlfrescoRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("CommonModelStrateyB")
public class CommonModelStrategy implements ModelStrategy {

    @Autowired
    @Qualifier("ModelStrateyA")
    private ModelStrategy modelStrategyA;

    @Autowired
    @Qualifier("ModelStrateyB")
    private ModelStrategy modelStrategyB;

    @Override
    public Object getAppInfoModel(AppInfoWebscript appInfoWebscript) {

        String companyName = appInfoWebscript.getCompanyName();

        if (companyName.equals("A")) {
            return modelStrategyA.getAppInfoModel(appInfoWebscript);
        } else if (companyName.equals("B")) {
            return modelStrategyB.getAppInfoModel(appInfoWebscript);
        } else {
            throw new AlfrescoRuntimeException("Company name unknown");
        }
    }
}
