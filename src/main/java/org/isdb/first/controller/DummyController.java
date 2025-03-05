package org.isdb.first.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class DummyController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Biday Prithibi";
    }

    @DeleteMapping("/bye")
    public String test(){
        return "Bye";
    }

    @GetMapping("/square")
    public int square(@RequestParam int number){
        return number * number;
    }

    @GetMapping("/name")
    public String name(@RequestParam String myname,@RequestParam String fatherName){
        return "My name is " + myname +" , "+"My father's name is "+ fatherName ;
    }



}
