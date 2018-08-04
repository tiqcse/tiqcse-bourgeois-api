package tiqcse.bourgeois.api.tests.models;

//import org.springframework.web.bind.annotation.*;
import org.junit.*;

import tiqcse.bourgeois.api.models.*;

import static org.junit.Assert.assertEquals;


public class TestsProject {

    @Test
    public void Test01() {
    	
    	long id = 123L;
    	String c = "This is sample content.";
    	
    	Project p = new Project(id,c);

    	assertEquals( id, p.getId() ); 
    	assertEquals( c, p.getContent() ); 
    }

}
