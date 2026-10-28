package com.seduc2.pet.Service;

import com.seduc2.pet.Entity.Animal;
import com.seduc2.pet.Repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

   private final AnimalRepository animalRepository;
   public AnimalService(AnimalRepository animalRepository) {
      this.animalRepository = animalRepository;
   }
   public List<Animal> mostrarAnimais() {
      List<Animal> animaisList = new ArrayList<>();
      return animalRepository.findAll();
   }
   public void cadastrarAnimal(Animal animation) {
      Animal animal = new Animal();
      animal.setNome(animation.getNome());
      animal.setCastrado(animation.isCastrado());
      animal.setEspecie(animation.getEspecie());
      animal.setRaca(animation.getRaca());
      animal.setSexo(animation.getSexo());
      animal.setDataNascimento(animation.getDataNascimento());
      animal.setPeso(animation.getPeso());
      animal.setCor(animation.getCor());
      animal.setVacinacao(animation.getVacinacao());
      animalRepository.save(animal);
   }
}
