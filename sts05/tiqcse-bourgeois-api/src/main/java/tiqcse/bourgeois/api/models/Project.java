package tiqcse.bourgeois.api.models;

//import org.springframework.web.bind.annotation.*;

public class Project {

    private final long id;
    private final String content;

    public Project(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
