package id.co.prg7_miniproject_kidzone_spring.dao;

import id.co.prg7_miniproject_kidzone_spring.vo.UkuranVo;

import java.util.List;

public interface UkuranDao {
    List<UkuranVo> getAllUkurans();
    List<UkuranVo> getUkuranActive();
}
