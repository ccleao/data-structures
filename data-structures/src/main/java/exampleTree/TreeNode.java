package exampleTree;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value){
        if (value == data){
            return;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        }
            else {
                if (rightChild == null){
                    rightChild = new TreeNode(value);
                }
                else {
                    rightChild.insert(value);

            }
        }
    }

    public void traverseInOrder(){
        if (leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }
    public TreeNode(int data){
        this.data = data;
    }
}
