package com.eumji.zblog.service;

import com.eumji.zblog.vo.Pager;
import com.eumji.zblog.vo.Partner;
import java.util.List;

public interface PartnerService {

    List<Partner> findAll();

    void savePartner(Partner partner);

    /**
     * 分页查询好友列表
     * @param pager 分页对象
     * @param param
     * @return
     */
    List<Partner> loadPartner(Pager pager, String param);

    Partner getPartnerById(Integer id);

    void deletePartner(Integer id);

    void updatePartner(Partner partner);

    void initPage(Pager pager);
}
