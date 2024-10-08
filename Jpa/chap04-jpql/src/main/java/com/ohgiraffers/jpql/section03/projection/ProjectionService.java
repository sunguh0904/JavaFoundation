package com.ohgiraffers.jpql.section03.projection;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectionService {

    private ProjectionRepository projectionRepository;

    public ProjectionService(ProjectionRepository projectionRepository) {
        this.projectionRepository = projectionRepository;
    }

    @Transactional
    public List<Menu> singleEntityProjection() {
        List<Menu> menuList = projectionRepository.singleEntityProjection();
        menuList.get(0).setMenuName("맛있는 유니콘 고기");
        return menuList;
    }
}
