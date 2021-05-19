package leandro.blog.example.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class Program {
    public static void main ( String[]args)
    {
        SpringApplication.run(Program.class, args);
    }
}
