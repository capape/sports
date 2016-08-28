package es.capape.sports.service.mapper;

import org.springframework.stereotype.Component;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.model.vo.AgeCategoryVO;

@Component("categoryMapper")
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public AgeCategory createCategoryFromCategoryVO(AgeCategoryVO category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AgeCategoryVO createCategoryVOFromCategory(AgeCategory category) {
        // TODO Auto-generated method stub
        return null;
    }

}
