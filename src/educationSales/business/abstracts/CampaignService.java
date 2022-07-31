package educationSales.business.abstracts;

import educationSales.entities.concretes.Education;

import java.util.List;

public interface CampaignService {
    void updatePrice(List<Education> educations);
}
