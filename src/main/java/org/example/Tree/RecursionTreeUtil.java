package org.example.Tree;


import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RecursionTreeUtil {

    /**
     * 获取指定节点以及所有子节点
     */
    public static Node getNodeAndAllChildNode(List<Node> menus, Integer nodeId) {
        if(CollectionUtils.isEmpty(menus)) {
            return null;
        }

        return menus.stream()
                .filter(Objects::nonNull)
                .filter(e -> Objects.equals(e.getParentId(), nodeId))
                .peek(e -> recursionTree(menus, e))
                .findFirst()
                .orElse(null);
    }

    /**
     * 递归树
     */
    public static void recursionTree(List<Node> menus, Node menu) {
        if(CollectionUtils.isEmpty(menus)) {
            return;
        }

        List<Node> childList = getSingleNodeChildList(menus, menu);
        menu.setChildrenList(childList);

        // 再去递归看当前子节点列表中是否还存在子节点
        childList.forEach(child -> {
            if(hasChildNode(menus, child)) {
                recursionTree(menus, child);
            }
        });

    }

    /**
     * 获取单个节点下的子节点列表
     */
    public static List<Node> getSingleNodeChildList(List<Node> menus, Node menu) {
        if(CollectionUtils.isEmpty(menus)) {
            return Collections.emptyList();
        }

        return menus.stream()
                .filter(Objects::nonNull)
                .filter(e -> Objects.equals(e.getParentId(), menu.getId()))
                .collect(Collectors.toList());
    }

    /**
     * 是否有子节点
     */
    public static boolean hasChildNode(List<Node> menus, Node menu) {
        return CollectionUtils.size(getSingleNodeChildList(menus, menu)) > 0;
    }
}
