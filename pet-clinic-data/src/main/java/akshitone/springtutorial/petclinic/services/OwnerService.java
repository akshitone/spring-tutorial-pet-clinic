package akshitone.springtutorial.petclinic.services;

import akshitone.springtutorial.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
