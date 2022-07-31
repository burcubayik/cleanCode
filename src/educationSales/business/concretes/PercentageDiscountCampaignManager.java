package educationSales.business.concretes;

import educationSales.business.abstracts.CampaignService;
import educationSales.entities.concretes.Education;

import java.util.List;

public class PercentageDiscountCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Education> educations) {
        for (Education education:educations) {
            education.setPrice(education.getPrice()-(education.getPrice()*getPercetageDiscount()));
        }
    }
    private double getPercetageDiscount(){
        return  0.9;
    }
}
