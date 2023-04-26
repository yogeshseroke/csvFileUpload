package csvFileUpload.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import csvFileUpload.helper.CSVHelper;
import csvFileUpload.model.CsvModel;
import csvFileUpload.repository.CsvRepository;

@Service
public class CsvService {

	@Autowired
	CsvRepository csvRepository;
	
	public void save(MultipartFile file) {
	    try {
	      List<CsvModel> csvModels = CSVHelper.csvToTutorials(file.getInputStream());
	      csvRepository.saveAll(csvModels);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store csv data: " + e.getMessage());
	    }
	  }

	  public List<CsvModel> getAllTutorials() {
	    return csvRepository.findAll();
	  }
}
