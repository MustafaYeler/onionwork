package lagion.onionwork.core.application.abstracts.repositories;
import java.util.List;

import lagion.onionwork.core.domain.entities.Category;


public interface ICategoryRepository {

	List<Category> getAll();
}
