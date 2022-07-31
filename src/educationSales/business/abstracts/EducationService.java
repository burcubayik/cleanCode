package educationSales.business.abstracts;

import educationSales.entities.concretes.Education;

import java.util.List;

public interface EducationService {
    void add(Education education);
    List<Education> getAll();

}
