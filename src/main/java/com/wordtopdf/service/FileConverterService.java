package com.wordtopdf.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

@Service
public class FileConverterService {

	@Value("${upload.path}")
	private String path;

	public void convert(String file_path,String file_name) {
	 try {
		 System.out.println(path);
		 Document doc= new Document(file_path); 
		 doc.save(path+file_name+"_output.pdf",SaveFormat.PDF);
	 }catch (Exception e) {
		System.out.println(e);
	}
 }

}
