package PartyRoom.PartyRoom.repository;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.repository.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){

        return (List<Category>) categoryCrudRepository.findAll();
    }
    public Optional<Category> getCategory(Integer idCategory){

        return categoryCrudRepository.findById(idCategory);
    }
    public Category save(Category c){

        return categoryCrudRepository.save(c);
    }

    public void delete(Category c){

        categoryCrudRepository.delete(c);
    }
}
