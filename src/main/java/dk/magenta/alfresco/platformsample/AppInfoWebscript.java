package dk.magenta.alfresco.platformsample;

import com.google.gson.Gson;
import dk.magenta.alfresco.platformsample.modelstrategies.ModelStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.extensions.webscripts.AbstractWebScript;
import org.springframework.extensions.webscripts.WebScriptRequest;
import org.springframework.extensions.webscripts.WebScriptResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AppInfoWebscript extends AbstractWebScript {

    @Autowired
    @Qualifier("CommonModelStrateyB")
    private ModelStrategy modelStrategy;

    private String companyName;

    @Override
    public void execute(WebScriptRequest webScriptRequest, WebScriptResponse webScriptResponse) throws IOException {

        companyName = webScriptRequest.getServiceMatch().getTemplateVars().get("companyname");
        Gson gson = new Gson();

        Object model = modelStrategy.getAppInfoModel(this);

        webScriptResponse.getWriter().write(gson.toJson(model));
    }

    public String getCompanyName() {
        return companyName;
    }
}
