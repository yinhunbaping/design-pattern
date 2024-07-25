package org.example.Tree;

import lombok.Data;

import java.util.List;

@Data
public class Node {
    /**
     * 子节点id
     */
    private Integer id;

    /**
     * 子节点名称
     */
    private String name;

    /**
     * 父节点id
     */
    private Integer parentId;

    /**
     * 父节点名称
     */
    private String parentName;

    /**
     * 子节点列表
     */
    private List<Node> childrenList;

    public Node(Integer id, String name, Integer parentId, String parentName) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.parentName = parentName;
    }
}
