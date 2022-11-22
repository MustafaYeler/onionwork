package lagion.onionwork.webapi.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lagion.onionwork.core.domain.entities.Category;
import lagion.onionwork.infsrastructure.persistence.repositories.CategoryRepository;

@RestController
@RequestMapping("/api/category/")
public class CategoryController {

	private CategoryRepository _categoryRepository;

	@Autowired
	public CategoryController(CategoryRepository _categoryRepository) {
		this._categoryRepository = _categoryRepository;
	}
	
	@GetMapping("getall")
	public List<Category> getAll(){
		return _categoryRepository.getAll();
	}
}
