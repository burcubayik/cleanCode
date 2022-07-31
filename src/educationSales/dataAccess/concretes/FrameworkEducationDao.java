package educationSales.dataAccess.concretes;

import educationSales.dataAccess.abstracts.EducationDao;
import educationSales.entities.concretes.Education;

import java.util.ArrayList;
import java.util.List;

public class FrameworkEducationDao implements EducationDao {
    List<Education> educations = new ArrayList<>();
    @Override
    public void add(Education education) {
        System.out.println("Hibernate ile eklendi");
        educations.add(education);
    }

    @Override
    public List<Education> getAll() {
        return educations;
    }
}
