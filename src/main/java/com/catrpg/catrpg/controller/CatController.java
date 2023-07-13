package com.catrpg.catrpg.controller;

import com.catrpg.catrpg.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

}
