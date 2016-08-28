package es.capape.sports.service.mapper;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.model.vo.AgeCategoryVO;

public interface CategoryMapper {

    AgeCategory createCategoryFromCategoryVO(AgeCategoryVO category);

    AgeCategoryVO createCategoryVOFromCategory(AgeCategory category);

}
