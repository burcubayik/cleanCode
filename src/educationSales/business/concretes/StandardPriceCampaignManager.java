package educationSales.business.concretes;

import educationSales.business.abstracts.CampaignService;
import educationSales.entities.concretes.Education;

import java.util.List;

public class StandardPriceCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Education> educations) {
        for (Education education:educations) {
            education.setPrice(getCurrentStandardPrice());
        }
    }
    private double getCurrentStandardPrice(){
        //veri tabanına bağlan
        return 25;
    }
}
