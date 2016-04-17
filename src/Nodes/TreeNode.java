package Nodes;


import Nodes.BinaryNode;
import java.util.ArrayList;

/**
 *
 * @author David Jennings This class represents a node of a generic tree
 * structure.
 */
public class TreeNode<T> {

    private T data;
    private BinaryNode parent;
    private ArrayList<TreeNode> childList;

    public TreeNode(BinaryNode parent, T data) {
        this.parent = parent;
        this.data = data;
        childList = new ArrayList<TreeNode>();
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the parent
     */
    public BinaryNode getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public void addChild(TreeNode node) {
        this.childList.add(node);
    }

    public void removeChild(TreeNode node) {
        this.childList.remove(node);
    }

}
