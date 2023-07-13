package com.catrpg.catrpg.service.impl;

import com.catrpg.catrpg.repository.DamageRepository;
import com.catrpg.catrpg.service.DamageService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class DamageServiceImpl implements DamageService {

    private final DamageRepository damageRepository;

}
