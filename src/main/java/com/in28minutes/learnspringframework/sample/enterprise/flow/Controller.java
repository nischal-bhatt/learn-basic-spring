package com.in28minutes.learnspringframework.sample.enterprise.flow;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
   @GetMapping("/sum")
   public long displaySum()
   {
	   return businessService.calculateSum();
   }
}

@Component
class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum()
	{
		List<Integer> retrievedData =  dataService.getRetrieveDate();
	   
		return retrievedData.stream().reduce(Integer:: sum).get();
	}
}

@Component
class DataService {
	
	public List<Integer> getRetrieveDate()
	{
		return Arrays.asList(12,34,56,78,90);
	}
}
