package lagion.onionwork.infsrastructure.persistence.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import lagion.onionwork.core.application.abstracts.repositories.ICategoryRepository;
import lagion.onionwork.core.domain.entities.Category;

@Repository
public class CategoryRepository implements ICategoryRepository {

	
	
	@Override
	public List<Category> getAll() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1, "Ticimax"));
		categories.add(new Category(1, "TSoft"));
		categories.add(new Category(1, "Trendyol"));
		categories.add(new Category(1, "Hepsiburada"));
		return categories;
	}

}
