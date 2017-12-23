package es.capape.sports.service.mapper;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.model.dto.AgeCategoryDTO;

public interface CategoryMapper {

    AgeCategory createCategoryFromCategoryVO(AgeCategoryDTO category);

    AgeCategoryDTO createCategoryVOFromCategory(AgeCategory category);

}
