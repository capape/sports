package es.capape.sports.service.mapper;

import org.springframework.stereotype.Component;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.model.dto.AgeCategoryDTO;

@Component("categoryMapper")
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public AgeCategory createCategoryFromCategoryVO(AgeCategoryDTO category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AgeCategoryDTO createCategoryVOFromCategory(AgeCategory category) {
        // TODO Auto-generated method stub
        return null;
    }

}
