package kodlama.io.Devs.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
	
	Language findById(int id);
	Language findByName(String name);
	
	boolean existsByName(String name);
	

}
