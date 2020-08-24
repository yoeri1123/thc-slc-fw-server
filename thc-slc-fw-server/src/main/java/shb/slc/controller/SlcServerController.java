package shb.slc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fw-server/v1")
public class SlcServerController {

    @GetMapping("/prepost")
    public String prepostAPI(@RequestParam ("batchdate")String date){
        System.out.println(date+" prepost batch start");
        return "prepost batch success";
    }

    @GetMapping("/swinfo")
    public String swinfoAPI(@RequestParam ("batchdate")String date){
        System.out.println(date+" swinfo batch start");
        return "swinfo batch success";
    }

    @GetMapping("/swuse")
    public String swuseAPI(@RequestParam ("batchdate")String date){
        System.out.println(date+" swuse batch start");
        return "swuse batch success";
    }
}
