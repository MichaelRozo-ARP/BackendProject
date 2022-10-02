package PartyRoom.PartyRoom.service;

import PartyRoom.PartyRoom.entities.Category;
import PartyRoom.PartyRoom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){

        return categoryRepository.getAll();
    }
    public Optional<Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }
    public Category save(Category p){
        if(p.getCategoryId()==null){
            return categoryRepository.save(p);
        }else{
            Optional<Category> e = categoryRepository.getCategory(p.getCategoryId());
            if(e.isPresent()){
                return p;
            }else{
                return categoryRepository.save(p);
            }
        }
    }
    public Category update(Category p){
        if(p.getCategoryId()!=null){
            Optional<Category> q = categoryRepository.getCategory(p.getCategoryId());
            if(q.isPresent()){
                if(p.getCategoryName()!=null){
                    q.get().setCategoryName(p.getCategoryName());
                }
                if(p.getDescriptionCategory()!=null){
                    q.get().setDescriptionCategory(p.getDescriptionCategory());
                }
                if(p.getParty_room()!=null){
                    q.get().setParty_room(p.getParty_room());
                }
                categoryRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Category>p= categoryRepository.getCategory(id);
        if(p.isPresent()) {
            categoryRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }
}
