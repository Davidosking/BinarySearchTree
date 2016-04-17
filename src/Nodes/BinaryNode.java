package Nodes;


/**
 *
 * @author David Jennings
 * This class represents a node that can be used in a binary tree structure.
 */
public class BinaryNode <T>{
    private T data;
    private BinaryNode leftChild;
    private BinaryNode rightChild;
    private BinaryNode parent;
    
    public BinaryNode(T data, BinaryNode parent, BinaryNode leftChild, BinaryNode rightChild){
        this.data=data;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        
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
     * @return the leftChild
     */
    public BinaryNode getLeftChild() {
        return leftChild;
    }

    /**
     * @param leftChild the leftChild to set
     */
    public void setLeftChild(BinaryNode leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * @return the rightChild
     */
    public BinaryNode getRightChild() {
        return rightChild;
    }

    /**
     * @param rightChild the rightChild to set
     */
    public void setRightChild(BinaryNode rightChild) {
        this.rightChild = rightChild;
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
}
