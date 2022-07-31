package workingWithMethods.core.adapters;

import workingWithMethods.business.abstracts.PersonService;
import workingWithMethods.entities.concretes.Person;
import workingWithMethods.kpsService.KpsService;

public class KpsServiceAdapter implements PersonService {
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService = new KpsService();

        return kpsService.checkPerson(Long.parseLong(person.getIdentityNumber()),person.getFirstName(),person.getLastName(),person.getDateOfBirth());
    }
}
