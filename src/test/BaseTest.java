import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.example.Tree.Node;
import org.example.Tree.RecursionTreeUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class BaseTest {
    public List<Node> buildNodes() {
        List<Node> nodes = Lists.newArrayList();
        nodes.add(new Node(1, "根节点", 0, ""));
        nodes.add(new Node(2, "子节点1.1", 1, "根节点"));
        nodes.add(new Node(3, "子节点1.2", 1, "根节点"));
        nodes.add(new Node(4, "子节点2.1", 2, "子节点1.1"));
        nodes.add(new Node(5, "子节点3.1", 4, "子节点2.1"));

        return nodes;
    }

    @Test
    public void recursionTree() {
        Node nodeTree = RecursionTreeUtil.getNodeAndAllChildNode(buildNodes(), 0);
        System.out.println(JSONObject.toJSONString(nodeTree));
    }

    @Test
    public void streamGroupTree() {
        List<Node> nodes = buildNodes();
        // 按照父节点id分组
        Map<Integer, List<Node>> parentId2Nodes = nodes.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Node::getParentId));

        // 遍历寻找子节点
        nodes.forEach(node -> node.setChildrenList(parentId2Nodes.getOrDefault(node.getId(), Lists.newArrayList())));

        // 打印根节点
        Node rootNode = nodes.stream()
                .filter(e -> Objects.equals(e.getId(), 1))
                .findFirst()
                .orElse(null);
        System.out.println(JSONObject.toJSONString(rootNode));
    }
}
