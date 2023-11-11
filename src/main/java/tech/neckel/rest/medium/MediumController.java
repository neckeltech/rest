package tech.neckel.rest.medium;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medium")
public class MediumController {

    @GetMapping("example-one")
    public long exampleOne(@RequestParam long id){
        return id;
    }

    @GetMapping("example-two/id/{id}")
    public long exampleTwo(@PathVariable("id") long id){
        return id;
    }

    @GetMapping("example-three")
    public String exampleThree(@RequestHeader("User-Agent") String userAgente, @RequestParam("id") long id){
        return userAgente;
    }
}
