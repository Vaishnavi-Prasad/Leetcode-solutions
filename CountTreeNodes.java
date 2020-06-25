class CountTreeNodes {
  public int countNodes(TreeNode root) {
    if (root == null)  
    return 0;  
  
    int res = 0;  
    if (root.left != null && root.right != null)  
    res++;  
  
    return res=countNodes(root.left)+countNodes(root.right) + 1;  
    }
}
