package educationSales;

import educationSales.business.abstracts.EducationService;
import educationSales.business.concretes.EducationManager;
import educationSales.business.concretes.PercentageDiscountCampaignManager;
import educationSales.business.concretes.StandardPriceCampaignManager;
import educationSales.dataAccess.concretes.FrameworkEducationDao;
import educationSales.entities.concretes.Education;

public class Main {
    public static void main(String[] args) {
        Education education = new Education(1,"Java",100);
        EducationService educationService = new EducationManager(new FrameworkEducationDao(),new PercentageDiscountCampaignManager());
        educationService.add(education);
        for (Education item: educationService.getAll()
             ) {
            System.out.println(item.getPrice());

        }

    }
}
