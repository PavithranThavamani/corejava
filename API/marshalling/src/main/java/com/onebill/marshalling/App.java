package com.onebill.marshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App 
{
    public static void main( String[] args )
    {
    	
     Employee employee = new Employee();
     employee.setId(1);
     employee.setName("Cool Suresh");
     employee.setSalary(100000);
     employee.setDesignation("Developer");
     
     try {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
		marshaller.marshal(employee, System.out);
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
