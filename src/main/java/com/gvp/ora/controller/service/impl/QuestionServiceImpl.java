package com.gvp.ora.controller.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.ora.controller.service.QuestionService;
import com.gvp.ora.entities.GcmCategory;
import com.gvp.ora.entities.Question;
import com.gvp.ora.entities.TypeQuestion;
import com.gvp.ora.repo.CatGcmRepo;
import com.gvp.ora.repo.QuestionRepo;
import com.gvp.ora.repo.TypeQuestionRepository;
import com.gvp.ora.utils.Filter;

@Service
public class QuestionServiceImpl implements QuestionService {

	// injection des différents répo en relation avec la classe question
	@Autowired
	private QuestionRepo questionRepo;
	@Autowired 
	private CatGcmRepo catGcmRepo;
	@Autowired
	private TypeQuestionRepository typeQuestionRepo;
	
	

	@Override
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}

	// filtrer les questions de la base de donnée selon données de l'IU.
	@Override
	public List<Question> getQuestionsFiltered(Filter filter) {
		

		// on récupère toutes les questions de la BDD, onb les filtres ensuite
		List<Question> inListQ = questionRepo.findAll();

		// liste des questions après le filtre
		List<Question> outListQ = inListQ.stream()
				
				// ici on test dans un tableau
				.filter(Q -> filter.getCategorieGcm().contains(Q.getGcmCategorie().getName()))
				.filter(Q -> filter.getProgrammingLanguage().contains(Q.getLanguageQuestion().getName()))
				.filter(Q -> filter.getTypeQuestion().contains(Q.getTypeQuestion().getType()))
				
				// ici on test exactement un string (simple, moyen ou difficilie)
				.filter(Q -> Q.getGcmLevel().getDifficulty().equals(filter.getNiveau()))

				.collect(Collectors.toList());
		
		return outListQ;
	}

	@Override
	public List<GcmCategory> getAllCatGcm() {
		return catGcmRepo.findAll();	
		
	}

	@Override
	public List<TypeQuestion> getAllTypeQuestion() {
		return typeQuestionRepo.findAll();
	}

	
	
	// permet de convertir un tableau écrit en String en ArrayList<String> (n'est plus utile pour l'instant)
//	public ArrayList<String> convertStringToArrayList(String arrayString) {
//		Gson googleJson = new Gson();
//		ArrayList<String> javaArrayListFromGSON = googleJson.fromJson(arrayString, ArrayList.class);
//		return javaArrayListFromGSON;
//	}

}
