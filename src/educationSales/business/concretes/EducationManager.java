package educationSales.business.concretes;

import educationSales.business.abstracts.CampaignService;
import educationSales.business.abstracts.EducationService;
import educationSales.dataAccess.abstracts.EducationDao;
import educationSales.entities.concretes.Education;

import java.util.List;

public class EducationManager implements EducationService {
    EducationDao educationDao;
    CampaignService campaignService;

    public EducationManager(EducationDao educationDao, CampaignService campaignService) {
        this.educationDao = educationDao;
        this.campaignService = campaignService;
    }

    @Override
    public void add(Education education) {

    this.educationDao.add(education);
    }

    @Override
    public List<Education> getAll() {
        campaignService.updatePrice(this.educationDao.getAll());
        return this.educationDao.getAll() ;
    }







}
