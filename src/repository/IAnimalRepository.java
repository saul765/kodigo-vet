package repository;

import domain.Animal;

public interface IAnimalRepository {

    Animal getAnimal(Integer numeroDocumentoDuenio);
}
