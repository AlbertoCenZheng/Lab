public class NodeList {
    private int size = 0;
    private Node root = null;
    
    /*
     * It has to take a new Node and add that to the beginning of the linked list.
     * If the list is empty, assign it as the "root". 
     * @Param - Node
     */
    public void insertAtBeginning(Node newNode) {
           if (root == null)
        	   root = newNode;
           else{
        	   newNode.setNext(root);
        	   root = newNode;
               }
    }
    
    
    /*
     * It has to take a Node and remove that node if you find it in the list 
     * from the existing nodes otherwise dont do anything.
     * 
     * @return void (if the list is empty, throw an error)
     */
    public void removeFromBeginning(){
        /*
         *Implement This Method!!!!!!
         */
    	if (root == null)
    		return;
    	else{
    		root = root.getNext();
    	}

    }
    
    /*
     * It has to return the size of the NodeList
     * 
     * @return size
     */
    public int size() {
        return size;
    }
    
    /**
     * Start with the head and traverse, print till you reach null.
     */
    public void iterate(){
        /*
         *Implement This Method!!!!!!
         */

   	 Node currentNode = root;
   	
   	 if (root == null)
   			 return ;
   	 
   	 System.out.println("\n");
   	 
   	 while(currentNode != null){
   		 System.out.println(currentNode);
   		 currentNode = currentNode.getNext();
   		 
   	 }
    }
    
}
