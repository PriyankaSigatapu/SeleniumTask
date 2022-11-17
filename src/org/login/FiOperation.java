package org.login;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FiOperation {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\priya\\Desktop\\selenium\\Task\\File\\fileoperations.docx");
//	// to create a folder
//	boolean b = f.mkdir();
//	System.out.println("create a folder: "+b);
//	//create new file
//	boolean createNewFile = f.createNewFile();
//	System.out.println("create new file: "+createNewFile);
//	//file present
//	
//	boolean file = f.isFile();
//	System.out.println("file present: "+file);
//	
//	//can read
//	boolean canRead = f.canRead();
//	System.out.println("can read file: "+canRead);
//	//editable r not
//	boolean canWrite = f.canWrite();
//	System.out.println("can write : " +canWrite);
//	
//	//exists r not
//	boolean exists = f.exists();
//	System.out.println("exists r not: "+exists);
//	  
//	commons io version 2.7
	
	List<String> ref = FileUtils.readLines(f);
	for (int i = 0; i < ref.size(); i++) {
		System.out.print(ref);
	}
	
}
}
