package tiqcse.bourgeois.api.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import tiqcse.bourgeois.api.models.*;

import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/projects")
public class ProjectRestController {

    private final AtomicLong counter = new AtomicLong();

    // get all projects
    @GetMapping
    public List<Project> getProjects() {

    	List<Project> list = new ArrayList<Project>();
    	list.add( new Project(counter.incrementAndGet(), "This is a random project via GET.") );
    	list.add( new Project(counter.incrementAndGet(), "This is another random project via GET.") );

    	return list;
    }

    // create a project
    @PostMapping
    public String postProjects( @RequestParam(value="name", defaultValue="World") String name ) {

    	return "Supposedly POST done :-)";

    }

}
