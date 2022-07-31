package educationSales.dataAccess.abstracts;

import educationSales.entities.concretes.Education;

import java.util.List;

public interface EducationDao {
    void add(Education education);
    List<Education> getAll();
}
