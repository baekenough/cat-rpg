package com.catrpg.catrpg.service.impl;

import com.catrpg.catrpg.repository.CatRepository;
import com.catrpg.catrpg.service.CatService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CatServiceImpl implements CatService {

    private final CatRepository catRepository;

}
