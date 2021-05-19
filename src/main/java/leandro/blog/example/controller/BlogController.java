package leandro.blog.example.controller;

import leandro.blog.example.domain.Blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "blog")
public class BlogController {

    @GetMapping
    public List<Blog> Get() {
        return List.of(new Blog("estudando sprint framework", "hoje estou estudando  o spring framework"));
    }

}
