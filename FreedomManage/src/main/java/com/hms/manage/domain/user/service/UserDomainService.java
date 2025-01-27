package com.hms.manage.domain.user.service;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.domain.user.entity.Menu;
import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.domain.user.repository.UserRepository;
import com.hms.manage.infrastructure.config.SnowflakeGenerator;
import com.hms.manage.infrastructure.dao.MenuMapper;
import com.hms.manage.infrastructure.utils.BeanCopyUtil;
import com.hms.manage.interfaces.user.dto.UserMenuDTO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Boolean.TRUE;

/**
* @author Hms
* @description 针对表freedom_user_t
* @createDate 2023-09-02 21:20:28
*/
@Service
public class UserDomainService {

    @Autowired
    private UserRepository sysUserRepository;

    @Autowired
    private SnowflakeGenerator snowflake;

    @Autowired
    private MenuMapper menuDAO;


    public PageInfo<User> getUser(UserQuery userQuery) {
        return sysUserRepository.getUsers(userQuery);
    }

    public Integer addUser(User freedomUser) {
        freedomUser.setId(snowflake.next());
        return sysUserRepository.addUser(freedomUser);
    }

    public List<UserMenuDTO> getUserMenus() {
        List<Menu> menus = menuDAO.listMenusByUserInfoId(1854499220099170304L);
        List<Menu> catalogs = listCatalogs(menus);
        Map<Integer, List<Menu>> childrenMap = getMenuMap(menus);
        return convertUserMenuList(catalogs, childrenMap);
    }

    private List<Menu> listCatalogs(List<Menu> menus) {
        return menus.stream()
                .filter(item -> Objects.isNull(item.getParentId()))
                .sorted(Comparator.comparing(Menu::getOrderNum))
                .collect(Collectors.toList());
    }

    private Map<Integer, List<Menu>> getMenuMap(List<Menu> menus) {
        return menus.stream()
                .filter(item -> Objects.nonNull(item.getParentId()))
                .collect(Collectors.groupingBy(Menu::getParentId));
    }

    private List<UserMenuDTO> convertUserMenuList(List<Menu> catalogList, Map<Integer, List<Menu>> childrenMap) {
        return catalogList.stream().map(item -> {
            UserMenuDTO userMenuDTO = new UserMenuDTO();
            List<UserMenuDTO> list = new ArrayList<>();
            List<Menu> children = childrenMap.get(item.getId());
            if (CollectionUtils.isNotEmpty(children)) {
                userMenuDTO = BeanCopyUtil.copyObject(item, UserMenuDTO.class);
                list = children.stream()
                        .sorted(Comparator.comparing(Menu::getOrderNum))
                        .map(menu -> {
                            UserMenuDTO dto = BeanCopyUtil.copyObject(menu, UserMenuDTO.class);
                            dto.setHidden(false);
                            return dto;
                        })
                        .collect(Collectors.toList());
            } else {
                userMenuDTO.setPath(item.getPath());
                userMenuDTO.setComponent("Layout");
                list.add(UserMenuDTO.builder()
                        .path("")
                        .name(item.getName())
                        .icon(item.getIcon())
                        .component(item.getComponent())
                        .build());
            }
            userMenuDTO.setHidden(false);
            userMenuDTO.setChildren(list);
            return userMenuDTO;
        }).collect(Collectors.toList());
    }
}




